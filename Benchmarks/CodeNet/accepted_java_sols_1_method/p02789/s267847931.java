import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
        String str = null;
      
		if (n == m) {
          str = "Yes";
        } else {
          str = "No";
        }
		// 出力
		System.out.println(str);
	}
}