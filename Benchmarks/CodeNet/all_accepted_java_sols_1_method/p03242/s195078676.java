import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int ans = 0;
		String Nlen = Integer.toString(N );

		for(int i = 0;i < Nlen.length();i++){
			int tmp = N % 10;
			double tmp2 = Math.pow(10, i);
			if(tmp == 1){
				ans = (int) (ans + 9*tmp2);
			}else if(tmp == 9){
				ans = (int) (ans + 1*tmp2);
			}else{
				ans = (int) (ans + 1*tmp2); 
			}
			N = N / 10;
		} 

		//最大の数
		System.out.println(ans);

   		sc.close();
        return ;

    }
    
}

