import java.util.*;
	public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			char[] a = sc.next().toCharArray();
			char[] b = sc.next().toCharArray();
			char[] c = sc.next().toCharArray();
			
			int an= a.length;
			int bn = b.length;
			int cn = c.length;
			char turn = 'a';
			
			while(true) {
				if(turn=='a') {
					if(an==0) {
						System.out.println("A");
						return;
					}
					turn = a[a.length-an];
					an--;
				}
				if(turn=='b') {
					if(bn==0) {
						System.out.println("B");
						return;
					}	
					turn = b[b.length-bn];
					bn--;
				}	
				if(turn=='c') {
					if(cn==0) {
						System.out.println("C");
						return;
					}
					turn = c[c.length-cn];
					cn--;
				}
			}		
		}
	}