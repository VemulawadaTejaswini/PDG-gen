import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			//????????¶??\???
			if(a>b){
				int x = a;
				a = b;
				b = x;
			}
			if(b>c){
				int x = b;
				b = c;
				c = x;
			}
			if(a>b){
				int x = a;
				a = b;
				b = x;
			}
			System.out.print(a);
			System.out.print(" ");
			System.out.print(b);
			System.out.print(" ");
			System.out.println(c);
	}

}