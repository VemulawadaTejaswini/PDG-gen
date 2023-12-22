import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		
		int cnt = 0;
		for(int i = 1;i <= N;i++) {
			if(i%2 != 0) {
				 cnt++;
			}
		}
		double ans = (double)cnt  / N; 

		System.out.println(ans);

   		sc.close();
        return ;

    }
    
}
