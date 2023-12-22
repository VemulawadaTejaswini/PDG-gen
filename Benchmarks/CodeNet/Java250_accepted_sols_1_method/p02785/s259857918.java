import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    Integer h[] = new Integer[n];
    for(int i=0;i<n;i++){
      h[i]=sc.nextInt();
    }
    Arrays.sort(h);
    long ans=0;
    if(k<n){
      for(int i=0;i<n-k;i++){
        ans+=h[i];
      }
    }
    System.out.println(ans);
  }
}