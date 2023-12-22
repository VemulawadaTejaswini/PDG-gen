import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int l = sc.nextInt();
        int a[] = new int[n];
        boolean zero = false;
        int ans = 0;
        for(int i = 0; i < n;i++){
			a[i] = i + l;
          if(a[i] == 0){
            zero = true;
          }
            ans += a[i];
        }
        if(zero){
        }else if(l > 0){
          ans -= a[0];
        }else{
          ans -= a[n - 1];
        }
      	System.out.println(ans);
 
    }
}