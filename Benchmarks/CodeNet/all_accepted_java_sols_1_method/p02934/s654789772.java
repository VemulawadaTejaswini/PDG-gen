import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
	    int b;
      	double result = 0.0;
		for (int i = 0; i < a; i++){
          	b = sc.nextInt();
      		result =result + (1.0 / b);
	    }
      System.out.println(1.0 / result);
	}
}