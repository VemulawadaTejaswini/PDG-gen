import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] a = new long[n];
      long sum = 0;
      long ans = 0;
      for(int i = 0;i < n;i++)a[i]=sc.nextLong();
      for(int i = 0;i < n;i++){
        if(a[i]!=0)sum+=a[i];
        else{
          ans += sum/2;
          sum = 0;
        }
      }
      ans+=sum/2;
      System.out.println(ans);
    }
}
