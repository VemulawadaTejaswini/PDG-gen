import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		System.out.println(N-K+1);
	}
}