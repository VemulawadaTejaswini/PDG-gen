import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long sum=0;
    int[] a=new int[n];
    int b1=0,b2=0,f=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    for(int i=n-1;i>=0;i--){
      if(i==n-1){
        b1++;
      }else if(i>0){
        
        if(a[i+1]==a[i]){
          sum+=(long)a[i+1];
          b1++;
          f++;
        }else{
          if(b2==0){
            sum+=(long)(a[i]+1);
            b2+=2;
            f++;
          }else{
            if(b1>f){
              sum+=(long)(a[i]+1);
              b2+=2;
              f++;
            }else{
              sum+=(long)a[i];
              b2++;
              f++;
              b1=b2;
              if(a[i]>a[i-1]){
                b2=0;
              }
            }
          }
        }
      }else{
        sum+=(long)a[i+1];
      }
    }
    System.out.println(sum);
          
  }
}

