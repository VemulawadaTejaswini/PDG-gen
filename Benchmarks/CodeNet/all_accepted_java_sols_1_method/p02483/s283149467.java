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
			else{
				System.out.printf("%d %d %d\n", c, a, b);
			}
		}else{
			if(a<c){
				System.out.printf("%d %d %d\n", b, a, c);
			}
			else if(b>c) { 
				System.out.printf("%d %d %d\n", c, b, a);
			}
			else{
				System.out.printf("%d %d %d\n", b, c, a);
			}
		}

	}
}