import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
      if(a[i]!=i+1){
        sum++;
      }
    }
    System.out.println( (sum==2||sum==0)?"YES":"NO");
  }
}
