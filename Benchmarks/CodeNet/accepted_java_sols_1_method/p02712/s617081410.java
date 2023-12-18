import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 0;

		n = sc.nextInt();
		long ans = 0;
        for (int i = 0; i < n+1; i++) {
            if(!(i % 3 == 0 || i % 5 == 0)){
            	ans += i;
            }
        }



			System.out.println(ans);

	}
}