import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long[] a=new long[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
    }
    Arrays.sort(a);
    boolean flg=true;
    for(int i=1;i<n;i++){
      if(a[i]==a[i-1]){
        flg=false;
        break;
      }
    }
    if(flg){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
