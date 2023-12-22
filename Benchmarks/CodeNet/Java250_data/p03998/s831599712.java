import java.util.*;
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			char[] Sa = sc.next().toCharArray();
			char[] Sb = sc.next().toCharArray();
			char[] Sc = sc.next().toCharArray();			
			int a = Sa.length;
			int b = Sb.length;
			int c = Sc.length;
			char card = 'a';			
			while(true) {
				if(card=='a') {
					if(a==0) {
						System.out.println("A");
						return;
					}
					card = Sa[Sa.length-a];
					a--;
				}
				if(card=='b') {
					if(b==0) {
						System.out.println("B");
						return;
					}	
					card = Sb[Sb.length-b];
					b--;
				}	
				if(card=='c') {
					if(c==0) {
						System.out.println("C");
						return;
					}
					card = Sc[Sc.length-c];
					c--;
				}
			}		
		}
	}