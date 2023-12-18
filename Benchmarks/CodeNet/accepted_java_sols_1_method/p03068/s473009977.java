import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		String S=sc.next();
		int K=sc.nextInt();

		String[] strs=S.split("");

		String check=strs[K-1];

		for(int i=0;i<N;i++) {
			if(!strs[i].equals(check)) strs[i]="*";
			System.out.print(strs[i]);
		}
		System.out.println();


		sc.close();
	}

}
