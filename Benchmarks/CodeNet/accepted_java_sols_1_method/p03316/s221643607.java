import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		// スペース区切りの整数の入力
		int N = sc.nextInt();

		int len = String.valueOf( N ).length();//Nの桁数
		
		int wk = N;
		int ai = 0;
		
		//最大の数から素数を探す
		for(int i = 0;i < len;i++)
		{
			ai += wk % 10;
			wk = wk / 10;
		}

        if (N % ai ==0){
    		System.out.println("Yes");
        	
        }else{
    		System.out.println("No");
        }
        return ;

    }
    
}

