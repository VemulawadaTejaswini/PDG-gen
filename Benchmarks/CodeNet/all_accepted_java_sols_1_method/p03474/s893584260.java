import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		int length = s.length();
		if(a>=1 && a<=5 && b>=1 && b<= 5) {
			if((a+b+1) != length) {
				System.out.println("No");
				return;
			}else {
				char c = s.charAt(a);
				if(c != '-') {
					System.out.println("No");
					return;
				}else {
					
					String[] str = s.split("-");
					if(str.length==2) {
						String A = str[0];
						String B = str[1];
						for(int i=0; i<a; i++) {
							char t = A.charAt(i);
							int tmp = Integer.valueOf(t);
							if(tmp<48 || tmp>57) {
								System.out.println("No");
								return;
							}
						}
						for(int i=0; i<b; i++) {
							char t = B.charAt(i);
							int tmp = Integer.valueOf(t);
							if(tmp<48 || tmp>57) {
								System.out.println("No");
								return;
							}
						}
						System.out.println("Yes");
						return;
					}else {
						System.out.println("No");
						return;
					}
				}
			}
		}
		

		
	
	}
}
