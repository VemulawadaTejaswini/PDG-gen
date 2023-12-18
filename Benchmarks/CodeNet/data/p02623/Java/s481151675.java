import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),m=sc.nextInt(),ans=0;
    long k=sc.nextLong(),sum=0;
    long[] a=new long[n],b=new long[m];
    for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
    }
    for(int i=0;i<m;i++){
      b[i]=sc.nextLong();
    }
    if(k<a[0]&&k<b[0]){
      System.out.println(0);
    }else{
      int i=0,j=0;
      while(sum<=k){
        if(i==n){
          if(j==m){
            break;
          }else{
            sum+=b[j];
            ans++;
            j++;
          }
        }else if(j==m){
          sum+=a[i];
          ans++;
          i++;
        }else{
          if(a[i]<=b[j]){
            sum+=a[i];
            ans++;
            i++;
          
          }else{
            sum+=b[j];
            ans++;
            j++;
          }
        }
      }
      if(i<n||j<m||sum>k){
        System.out.println(ans-1);
      }else{
        System.out.println(ans);
      }
    }
  }
}

