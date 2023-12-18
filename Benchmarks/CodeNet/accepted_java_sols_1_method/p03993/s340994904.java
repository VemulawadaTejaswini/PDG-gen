import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n+1];
      for(int i = 1;i <= n;i++)a[i]=sc.nextInt();
      int cnt = 0;
      boolean[] friend = new boolean[n+1];
      Arrays.fill(friend,true);
      for(int i = 1;i <= n;i++){
      	if(a[a[i]]==i&&friend[i]==true&&friend[a[i]]==true){
        	cnt++;
            friend[i]=false;
            friend[a[i]]=false;
        }
      }
      System.out.println(cnt);
    }
}
