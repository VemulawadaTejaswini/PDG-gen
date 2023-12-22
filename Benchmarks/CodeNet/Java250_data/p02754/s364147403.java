import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n,a,b,ans;
		
		n=sc.nextLong();
		a=sc.nextLong();
		b=sc.nextLong();
		if(a + b != 0){
			ans=n/(a+b);
			n%=a+b;
			ans*=a;
			if (n<a){
				ans+=n;
			}else{
				ans+=a;
			}
		} else {
			ans=(long)0;
		}

		System.out.println(ans);
		sc.close();
	}
}