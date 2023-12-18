import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    long[] a = new long[k];
    for(int i=0;i<k;i++)a[i]=sc.nextLong();
    long[] l = new long[k+1];
    long[] r = new long[k+1];
    l[k]=2;
    r[k]=2;
    for(int i=k;i>0;i--){
      if(r[i]%a[i-1]==0||l[i]%a[i-1]==0||l[i]/a[i-1]<r[i]/a[i-1]){
        l[i-1]=(long)Math.ceil((double)l[i]/a[i-1])*a[i-1];
        r[i-1]=(long)Math.floor((double)r[i]/a[i-1])*a[i-1]+a[i-1]-1;
      }else{
        System.out.println(-1);
        return;
      }
    }
    System.out.println(l[0]+" "+r[0]);
  }
}
