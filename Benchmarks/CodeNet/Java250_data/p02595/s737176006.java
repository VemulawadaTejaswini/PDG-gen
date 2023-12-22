import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count = 0;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long d = sc.nextLong();
		long dd = d * d;

		sc.nextLine();
		for(int i=0;i<n;i++){
			long p = sc.nextLong();
			long q = sc.nextLong();
			long dist = p*p+q*q;
			if(dist <= dd){
				count++;

			}

		}

		System.out.println(count);


	}

}