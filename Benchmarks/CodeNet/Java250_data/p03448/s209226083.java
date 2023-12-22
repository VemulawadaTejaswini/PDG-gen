	import java.util.*;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int X = sc.nextInt();
			
			int ret = 0;
			
			for (int a=0;a<=A;a++) {
				for (int b=0;b<=B;b++) {
					int Y = X - 500*a - 100*b;
					for (int c=0;c<=C;c++) {
						if (Y==50*c) {
							ret++;
						}
					}
				}
			}
			
			
			System.out.println(ret);
			
			sc.close();
		}
		
	}
