import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();

		boolean yes;
		if (n % 2 == 0){
			yes = (n /  2 >= k );
		}else{
			yes = (n /  2 + 1 >= k );

		}
		if(yes){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}
}
