import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		int a[]=new int[2];
		long x=1;
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
			x*=a[i];
		}
		if(x>Math.pow(10, 18)) System.out.println("-1");
		else System.out.println(x);
		
	}

}
