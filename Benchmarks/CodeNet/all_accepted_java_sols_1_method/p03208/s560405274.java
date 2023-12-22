import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] h=new int[n];
        for (int i = 0; i < n; i++) {
            h[i]=sc.nextInt();
        }
      //ソートしてしまえばK個の区間で添え字が一番大きいものがhmax,小さいものがhmin
        Arrays.sort(h);
        int ans=h[n-1];
      //iをソート済み配列内のK個の区間の左端のindexにして動かす
      //0-indexedであることに注意（右からK個目のindexはn-kである）
        for (int i = 0; i <=n-k ; i++) {
            ans=min(h[i+k-1]-h[i],ans);
        }
        out.println(ans);
    }
}