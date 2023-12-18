import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int []a=new int[200010];
        int []ar=new int[200010];
      for(int i=2;i<=n;i++)
      {
        a[i]=s.nextInt();
      }
      for(int i=2;i<=n;i++)
      {
        ar[a[i]]++;
      }
       for(int i=1;i<=n;i++)
       {
         System.out.println(ar[i]);
       }
    }
}
