import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
		int l = sc.nextInt();
        String ans[] = new String[n];
        for(int i = 0;i < n;i++){
          ans[i] = sc.next();
        }
		Arrays.sort(ans);
        
        for(int i = 0;i < n;i++){
          System.out.print(ans[i]);
        }
          System.out.println();
    }
}