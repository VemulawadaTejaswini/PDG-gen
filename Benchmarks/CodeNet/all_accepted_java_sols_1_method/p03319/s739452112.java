import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=Integer.parseInt(sc.next());
		int K=Integer.parseInt(sc.next());
		System.out.println((int)Math.ceil((double)(N-K)/(K-1))+1);
	}
}
	
