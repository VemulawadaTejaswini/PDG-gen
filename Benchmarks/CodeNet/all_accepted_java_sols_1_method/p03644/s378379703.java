import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 1){
			System.out.println(1);
		}else{
			int ans=1;
			for(int i=1; i<8; i++){
				ans = ans*2;
				if ( n < ans) break;
			}
			System.out.println(ans/2);
		}

	}
}
