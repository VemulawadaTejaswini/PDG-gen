import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int B=N;
		int a=0;
		while(B>0) {
			a=a+B%10;
			B=(int)B/10;
		}
		if(N%a==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}