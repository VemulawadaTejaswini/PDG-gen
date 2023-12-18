import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long sum=0;
    int[] a=new int[n];
    int[] b=new int[n],f=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    for(int i=n-1;i>=0;i--){
      if(i==n-1){
        b[a[i]-1]++;
      }else{
        
        if(a[i+1]==a[i]){
          sum+=(long)a[i+1];
          b[a[i]-1]++;
          f[a[i]-1]++;
        }else{
          if(b[a[i]-1]==0){
            sum+=(long)(a[i]+1);
            b[a[i]-1]+=2;
            f[a[i]-1]++;
          }else{
            if(b[a[i]]>f[a[i]-1]){
              sum+=(long)(a[i]+1);
              b[a[i]-1]+=2;
              f[a[i]-1]++;
            }else{
              sum+=(long)a[i];
              b[a[i]-1]++;
            }
          }
        }
      }
    }
    System.out.println(sum);
          
  }
}


