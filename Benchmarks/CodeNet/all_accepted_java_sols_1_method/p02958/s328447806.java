import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] p = new int[n];
    for(int i = 0;i<n;i++)p[i]=sc.nextInt();
    int count = 0;
    for(int i = 0;i<n;i++){
      if(p[i]-i!=1)count++;
    }
    if(count==2||count==0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
