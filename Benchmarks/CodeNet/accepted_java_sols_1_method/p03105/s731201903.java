import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int ans=0;

		if(a>b)ans=0;
		else{
			if(b/a>=c)ans=c;
			else if(b/a<c)ans=b/a;
		}

		System.out.println(ans);
		sc.close();
	}
}

