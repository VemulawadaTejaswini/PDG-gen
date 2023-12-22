import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		//int N = sc.nextInt();
    	//int M = sc.nextInt();
      	String S = sc.next();
      System.out.println(S.matches("A[a-z]+C[a-z]+") ? "AC" : "WA");
    }
}
