import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int x = sc.nextInt();
    	String ans = "NO";

    	if(x == 3||x==5||x==7){
    		ans = "YES";
    	}
    	// 出力
    	System.out.println(ans);
    }
}