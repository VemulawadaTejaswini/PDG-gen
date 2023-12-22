import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int ab = sc.nextInt();
    	int bc = sc.nextInt();
    	int ca = sc.nextInt();

    	int ans = ab * bc / 2;
    	
    	// 出力
    	System.out.println(ans);
    }
}