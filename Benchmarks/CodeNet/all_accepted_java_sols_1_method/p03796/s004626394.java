import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		Long N = sc.nextLong();
		long K =  1;
		Long z=(long) Math.pow(10, 9);
		int i;
		for(i=1;i<=N;i++){
		K=K*i % (z+7);
		
		}
		
		System.out.println(K);
	

	}
}