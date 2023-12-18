import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	String a = sc.next();
    	String b = sc.next();

    	String ans ="";

    	if(a.charAt(0) ==b.charAt(2) && a.charAt(1) ==b.charAt(1) && a.charAt(2) ==b.charAt(0)){
    		ans = "YES";
    	} else {
    		ans = "NO";
    	}

    	// 出力
    	System.out.println(ans);
    }
}