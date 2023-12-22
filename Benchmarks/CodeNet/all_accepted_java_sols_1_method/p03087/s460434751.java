import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int q = sc.nextInt();
      char[] c = sc.next().toCharArray();
      int[] l = new int[q];
      int[] r = new int[q];
      for(int i = 0;i < q;i++){
      	l[i]=sc.nextInt();
        r[i]=sc.nextInt();
      }
      int[] cnt = new int[n+1];
      for(int i=1;i<n;i++){
        if(c[i-1]=='A'&&c[i]=='C')cnt[i+1]++;
      	cnt[i+1]+=cnt[i];
      }
      for(int i = 0;i < q;i++)System.out.println(cnt[r[i]]-cnt[l[i]]);
    }
}
