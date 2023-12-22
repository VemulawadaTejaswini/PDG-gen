import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        
        int max = Math.max(a, b);
        max = Math.max(max, c);
        int notMax = 0;
        if (a != max) {
          notMax += a;
        }
        if (b != max) {
          notMax += b;
        }
        if (c != max) {
          notMax += c;
        }
    
		// 出力
		System.out.println(max == notMax ? "Yes" : "No");
	}
}