import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
        int n = N;
        int m, s = 0;

		for(int i=10; i>0; i--){
          m = n/(int)(Math.pow(10,i));
          s = s + m;
          if(m != 0){
            n = n - (int)(Math.pow(10,i))*m;
          }

        }
        s = s + n % 10;
		if(N % s == 0){
		  System.out.println("Yes");
        } else {
          System.out.println("No");
        }
	}
}