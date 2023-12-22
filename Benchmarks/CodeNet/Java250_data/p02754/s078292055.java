import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long N = sc.nextLong();
      	long A = sc.nextLong();
      	long B = sc.nextLong();
      	
      	long blue=N/(A+B);
		long mod=N%(A+B);
      if(mod>=A){
      mod=A;
	}
      System.out.println(blue*A+mod);
      
    }
}
