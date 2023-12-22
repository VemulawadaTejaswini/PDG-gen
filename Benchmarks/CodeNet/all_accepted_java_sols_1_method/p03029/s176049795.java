import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力　りんご
		int A = sc.nextInt();
		// 整数の入力　りんご　はんぱ
		int P = sc.nextInt();
		
		int all = A * 3 + P;
		
		int ans = all / 2;
		

		System.out.println(ans);

   		sc.close();
        return ;

    }
    
}

