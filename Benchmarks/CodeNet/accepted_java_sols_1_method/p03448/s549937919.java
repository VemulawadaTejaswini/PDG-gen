import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int x = sc.nextInt();

    	int ans = 0;

    	//500,100,50
    	for(int i = 0;i <= a;i++){
    		int tmp500 =+ 500 * i;
    		for(int j = 0;j <= b; j++){
    			int tmp100 =+ 100 * j;

    			for(int k = 0;k <= c;k++){
    				int tmp50 =+ 50 * k;
                	if(tmp500 + tmp100 + tmp50 == x){
                		ans++;
                	}
    			}
    		}
    	}


    	// 出力
    	System.out.println(ans);
    }
}