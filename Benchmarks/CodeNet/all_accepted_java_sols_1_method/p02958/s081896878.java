import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] p=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
      p[i]=sc.nextInt();
      if(p[i]!=i+1){
        sum++;
      }
    }
    if(sum<=2){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}