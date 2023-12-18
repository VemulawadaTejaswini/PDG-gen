import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		long sum=0,n=stdIn.nextLong();
		for(int i=0;i<n;i++) sum+=stdIn.nextLong();
		System.out.println(sum/n);
	}
}