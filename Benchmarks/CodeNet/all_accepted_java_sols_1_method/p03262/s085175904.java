import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();	
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			x=Math.abs(m-x);
				alist.add(x);		
		}
		 int tmp;
		 int x;
		 int y=alist.get(0);
		 for (int i = 0; i < n; i++) {
			 x=alist.get(i);		 
	     while ((tmp = x % y) != 0) {
	            x = y;
	            y = tmp;
	        }
		 }
		 System.out.print(y);
	}
}