import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		List<Integer> list=new ArrayList<Integer>();
		try{
			scan = new Scanner(System.in);
			int n = scan.nextInt();
			for(int i = 1;i < 2 * n +1;i++){
				list.add(i);
			}
			int operation = scan.nextInt();
			for(int i = 0;i < operation;i++){
				int op = scan.nextInt();
				if(op == 0){
					Integer [] A = list.toArray(new Integer[2 * n]);
					list.clear();
					for(int j = 0;j < n;j++){
						list.add(A[j]);
						list.add(A[j+n]);
					}
				}else{
					for(int j = 0 ; j < op;j++){
						list.add(list.remove(0));
					}
				}
			}
			Iterator<Integer> it = list.iterator();
			while(it.hasNext())
				System.out.println(it.next());
		}finally{
			if(scan !=null)scan.close();
		}
	}
}