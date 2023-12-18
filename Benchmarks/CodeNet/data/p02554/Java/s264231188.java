import java.util.*;
public class Main {
  	public static int pow1(int a, int b) {
      	long res = a;
      	for( int i = 0; i < b - 1; i++ ) {
          	res = res * a % 1000000007;
        }
      	return (int)res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        //if(a > 10) System.exit(1);
      	int i = pow1(10, a);
      	int j = pow1(9, a) * 2 % 1000000007;
      	int k = pow1(8, a);
      	
      	long l = i - j + k;
      	l %= 1000000007;
      	if(l < 0) {
        	l += 1000000007;
        }
        System.out.println(l);
    }
}
import java.util.*;
public class Main {
  	public static int pow1(int a, int b) {
      	long res = a;
      	for( int i = 0; i < b - 1; i++ ) {
          	res = res * a % 1000000007;
        }
      	return (int)res;
    }
}