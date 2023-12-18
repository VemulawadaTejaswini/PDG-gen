import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] x = new int[m];
      int[] y = new int[m];
      for(int i = 0;i < m;i++){
      	x[i]=sc.nextInt();
        y[i]=sc.nextInt();
      }
      boolean[] red = new boolean[n+1];
      int[] cnt = new int[n+1];
      for(int i = 1;i <= n;i++){
        cnt[i]=1;
        red[i]=false;
      }
      red[1]=true;
      for(int i = 0;i < m;i++){
      	if(red[x[i]])red[y[i]]=true;
        cnt[x[i]]--;
        cnt[y[i]]++;
        if(cnt[x[i]]==0)red[x[i]]=false;
      }
      int sum = 0;
      for(int i = 1;i <= n;i++)if(red[i])sum++;
      System.out.println(sum);
    }
}