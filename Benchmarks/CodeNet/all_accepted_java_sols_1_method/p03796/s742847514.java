import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long p=1;
		for(int i=1;i<=N;i++){
			p=(p*i)%1000000007;
		}
			System.out.println(p);
		sc.close();
	}
}