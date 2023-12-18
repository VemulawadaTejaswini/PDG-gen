import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i%3==0||i%10==3){
				System.out.print(i);
				int a=n%3;
				int b=n%10-3;
				int min=a;
				if(min>b)min=b;
				if(i!=n-min)System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
}

