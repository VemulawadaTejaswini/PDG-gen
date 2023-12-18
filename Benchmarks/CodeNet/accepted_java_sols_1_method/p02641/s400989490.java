import java.util.ArrayList;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int x = sc.nextInt();
			int n = sc.nextInt();
			ArrayList<Integer> p = new ArrayList<Integer>();
			
			for(int i=0;i<n;i++) {
				p.add(sc.nextInt());
			}
			
			for(int i=0;;i++) {
				if(!p.contains((x-i))) {
					System.out.println(x-i);
					return;
				}
				
				if(!p.contains((x+i))) {
					System.out.println(x+i);
					return;
				}
			}
			
		}
	}
