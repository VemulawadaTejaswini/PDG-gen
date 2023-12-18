import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int X = sc.nextInt();

		int intArray[] = new int[N];
		for (int i = 0; i < N;i ++ ){
			intArray[i] = sc.nextInt();
		}

		int sum = 0;
		int cnt = 0;
		if(sum < X){
			cnt ++;
		}else{
			System.out.println(cnt);
	   		sc.close();
	        return ;
		}

		for (int i = 0; i < N;i ++ ){
			sum = sum + intArray[i];
			if(sum <= X){
				cnt ++;
			}else{
				break ;
			}
		}

		System.out.println(cnt);

   		sc.close();
        return ;

    }
    
}

