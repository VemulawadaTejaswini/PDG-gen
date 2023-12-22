import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		long a=sc.nextLong();
		long b=sc.nextLong();
		int k=sc.nextInt();

		long aa;

		for(int i=0;i<k;++i){
			b=b+a/2;
			a=a/2;

			aa=b;
			b=a;
			a=aa;
		}

		if(k%2==0)System.out.println(a+" "+b);
		else System.out.println(b+" "+a);

	}
}