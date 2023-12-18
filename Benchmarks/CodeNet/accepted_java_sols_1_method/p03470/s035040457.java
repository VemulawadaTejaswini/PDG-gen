import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] mochi=new int[n];
    int kari=0;
    int cnt=0;
    for(int i=0;i<n;i++) mochi[i]=sc.nextInt();
    for(int i=0;i<=n-2;i++)
      for(int j=n-1;j>=i+1;j--)
        if(mochi[j]<mochi[j-1]){
          kari=mochi[j-1];
          mochi[j-1]=mochi[j];
          mochi[j]=kari;
        }
    for(int i=1;i<n;i++)
      if(mochi[i]!=mochi[i-1])cnt++;
    System.out.println(cnt+1);
  }
}