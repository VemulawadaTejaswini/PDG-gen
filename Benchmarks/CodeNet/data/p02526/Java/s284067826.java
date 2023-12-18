import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int n =  scan.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0 ; i < n ; i++){
				list.add(scan.nextInt());
			}
			int m = scan.nextInt();
			int counter = 0;
			for(int i = 0; i < m; i++){
				if(list.contains(scan.nextInt())) counter++;
			}
			System.out.println(counter);
		}finally{
			scan.close();
		}
	}
}