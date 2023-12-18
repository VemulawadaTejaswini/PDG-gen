import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  while(true){
    int n = sc.nextInt();
    if(n==0) break;
    int[] a = new int[n];
    int maxn=0,minn=0,Ave=0;
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
      if(i==0){
        maxn=a[0];
        minn=a[0];
      }else{
        if(maxn<a[i]) maxn=a[i];
        if(minn>a[i]) minn=a[i];
      }
      Ave+=a[i];
    }
    Ave=Ave-maxn-minn;
    System.out.printf("%d\n",Ave/(n-2));
  }
  sc.close();
  }
}
