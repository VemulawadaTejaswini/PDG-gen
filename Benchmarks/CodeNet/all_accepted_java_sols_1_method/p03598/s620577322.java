import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int k =scan.nextInt();
		int x[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			x[i]=scan.nextInt();
			if(x[i] < k-x[i])sum+=x[i]*2;
			else sum+=(k-x[i])*2;
		}
		scan.close();
		System.out.println(sum);
	}

}