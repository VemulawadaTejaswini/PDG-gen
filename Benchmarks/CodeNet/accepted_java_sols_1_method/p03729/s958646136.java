import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String[] a = sc.next().split("");
        String[] b = sc.next().split("");
        String[] c = sc.next().split("");
        boolean isShiritori = 
          a[a.length - 1].equals(b[0]) &&
          b[b.length - 1].equals(c[0]);
        
        String ans = isShiritori ? "YES" : "NO";     
    
		// 出力
		System.out.println(ans);
	}
}
