import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		int c=0;
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 2; j < a[i]; j++) {
				if(a[i]%j==0) {
					c++;
					break;
				}
			}
		}
		System.out.println(n-c);
	}

}
