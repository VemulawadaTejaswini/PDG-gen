import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int max=0;
      int m=0;
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        max=Math.max(max,a[i]);
        m+=a[i];
      }
      System.out.println((m>2*max)?"Yes":"No");
	}
}
