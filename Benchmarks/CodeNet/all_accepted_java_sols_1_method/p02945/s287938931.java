import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();

		int c=a+b;
		int d=a-b;
		int e=a*b;

		int max=c;
		if(max<d) {
			max=d;
		}
		if(max<e){
			max=e;
		}
		System.out.println(max);
	}

}
