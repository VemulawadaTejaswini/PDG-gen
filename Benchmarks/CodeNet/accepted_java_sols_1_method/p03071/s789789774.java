import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
int ans=0;
		if(a>b){
	ans=ans+a;
			a=a-1;
}else{
	ans=ans+b;
	b=b-1;
}

		if(a>b){
			ans=ans+a;
					a=a-1;
		}else{
			ans=ans+b;
			b=b-1;
		}

		System.out.println(ans);

	}
}