import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int v = 0;
		int m = 0;
		for(int i = 0; i < n; i++){
			int p = scan.nextInt();
			v += p;
			if ( m < p) m =p;
		}
		System.out.println(v - m /2);
	}
}
