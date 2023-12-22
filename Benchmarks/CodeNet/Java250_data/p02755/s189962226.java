import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,x,ans;
		
		a=sc.nextInt();
		b=sc.nextInt();

		ans=-1;
		for (x=10*b+9; x>=10*b;x--){
			if(25*a <= 2*x && 2*x < 25*a+25){
				ans=x;
			}
		}

		System.out.println(ans);
		sc.close();
	}
}