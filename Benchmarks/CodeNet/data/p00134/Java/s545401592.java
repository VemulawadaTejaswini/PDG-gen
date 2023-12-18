import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int sum=0,n=stdIn.nextInt();
		for(int i=0;i<n;i++) sum+=stdIn.nextInt();
		System.out.println(sum/n);
	}
}