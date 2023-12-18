import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if(a<b){
			if(b<c){
				System.out.printf("%d %d %d\n", a, b, c);
			}else if(a<c){
				System.out.printf("%d %d %d\n", a, c, b);
			}
		}else{
			if(c>a){
				System.out.printf("%d %d %d\n", b, a, c);
			}
			else { 
				//System.out.printf("%d %d %d\n", b, c, a);
			}
		}

		if(b>a){
			if(b>c){
				if(a>c){
					System.out.printf("%d %d %d\n", c, a, b);
				}
			}
		}

		if(a>b&&b>c){
			System.out.printf("%d %d %d\n", c, b, a);
		}

		if(a>c&&c>b){
			System.out.printf("%d %d %d\n", b, c, a);	
		}

	}
}