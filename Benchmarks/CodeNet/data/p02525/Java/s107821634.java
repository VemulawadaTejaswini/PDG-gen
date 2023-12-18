import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int n;
			while((n = scan.nextInt())!=0 || scan.hasNext()){
				List<Integer> list = new ArrayList<Integer>();
				int ave = 0;
				for(int i = 0; i < n;i++){
					int d = scan.nextInt();
					ave += d;
					list.add(d);
				}
				ave /=n;
				double sgm = 0;
				Iterator<Integer> it = list.iterator();
				while(it.hasNext()){
					sgm += Math.pow(it.next() - ave, 2);
				}
				sgm = Math.sqrt(sgm / n);
				System.out.println(sgm);
			}
		}finally{
			scan.close();
		}
	}
}