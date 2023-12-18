import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a= new int[n+1];
    int[] b= new int[n];
    for(int i=0;i<=n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      b[i]=sc.nextInt();
    }
    long df=0;
    for(int i=0;i<n;i++){
      if(a[i]<b[i]){
        b[i]=b[i]-a[i];
        df+=a[i];
//        a[i]=0;
        if(a[i+1]<b[i]){
//          b[i]=b[i]-a[i+1];
          df+=a[i+1];
          a[i+1]=0;
        }else{
          a[i+1]=a[i+1]-b[i];
          df+=b[i];
//          b[i]=0;
        }
      }else{
//        a[i]=a[i]-b[i];
        df+=b[i];
//        b[i]=0;
      }
    }
    System.out.println(df);
  }
}