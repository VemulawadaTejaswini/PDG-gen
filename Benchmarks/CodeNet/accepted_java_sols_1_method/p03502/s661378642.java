import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int sum=0;
		int xcopy=x;
		for(int i=100000000;i>=1;i=i/10) {
			sum+=x/i;
			x=x%i;
		}
		if(xcopy%sum==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}