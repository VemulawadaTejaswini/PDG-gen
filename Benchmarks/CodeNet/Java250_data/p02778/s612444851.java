import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
	    String S = scanner.next();
	    
	    int x = S.length();
	    String ans="";
	    
	    for(int i=0; i<x; i++) {
	    	ans = ans.concat("x");
	    }
	    System.out.println(ans);
	}

}