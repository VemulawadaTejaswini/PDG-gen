import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int k = sc.nextInt();

    	int max = Math.max(Math.max(a, b), c);
    	int sum = a + b + c;

    	for (int i = 0; i < k; i++){
    		sum = sum + max;
    		max = max * 2;

    	}

    	// 出力
    	System.out.println(sum);
    }
}