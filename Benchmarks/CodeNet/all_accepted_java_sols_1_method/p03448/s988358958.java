import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int x = sc.nextInt();
        int ans = 0;
      
        A : for(int ia = 0; ia <= a; ia++) {
          int sum = ia * 500;
          B : for(int ib = 0; ib <= b; ib++) {
            int sumB = sum;
            sumB += ib * 100;
            C : for(int ic = 0; ic <= c; ic++) {
              int sumC = sumB;
              sumC += ic * 50;
              if (sumC == x) {
                ans++;
                break C;
              } else if (sum > x) {
                break C;
              }
            }
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}