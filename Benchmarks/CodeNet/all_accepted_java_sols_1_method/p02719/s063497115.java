import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long n =scn.nextLong();
		long k=scn.nextLong();
		if(n%k==0){
			System.out.println(0);
			return ;
		}
		n = n%k;
		long res= Math.min(n, Math.abs(n-k));
		System.out.println(res);

	}

}