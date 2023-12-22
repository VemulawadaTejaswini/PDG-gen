import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(b<c){
			System.out.print(b);
		}else{
			System.out.print(c);
		}
		System.out.print(" ");
		int d = b+c;
		if(d-a>=0){
			System.out.print(d-a);
		}else{
			System.out.print(0);
		}
	}
}