import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int r = sc.nextInt();
		// 整数の入力
		int D = sc.nextInt();
		// 整数の入力
		int x = sc.nextInt();
		
		int iend = 10;
//		int ans = 0;
		
		for(int i = 0;i<iend;i++){
			x = r * x - D; 
			System.out.println(x);
		}

   		sc.close();
        return ;

    }
    
}

