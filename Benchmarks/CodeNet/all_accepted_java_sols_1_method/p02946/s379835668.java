import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k= scan.nextInt();
		int x= scan.nextInt();
		scan.close();
		k-=1;
		for(int i=x-k;i<x+k;i++) {
			System.out.print(i+" ");
		}
		System.out.println(x+k);
	}

}