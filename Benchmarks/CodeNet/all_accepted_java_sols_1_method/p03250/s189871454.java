import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max;
		int min;

		if(a>b){
			max=a;
			a=b;
			b=max;
		}
		if(b>c){
			max=b;
			b=c;
			c=max;
		}



		 System.out.println(c*10+b+a);


	}
}