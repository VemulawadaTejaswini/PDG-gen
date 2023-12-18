import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		int c=0;
		boolean f;
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			f=false;
			for (int j = 2; j < a[i]; j++) {
				if(a[i]%j==0) {
					f=true;
					break;
				}
			}
			if(!f) {
				c++;
			}
		}
		System.out.println(c);
	}

}
