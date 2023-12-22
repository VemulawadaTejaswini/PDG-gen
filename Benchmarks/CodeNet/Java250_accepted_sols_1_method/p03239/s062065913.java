import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tlim = sc.nextInt();
    int[] c = new int[n];
    int[] t = new int[n];
    for(int i = 0;i<n;i++){
      c[i] = sc.nextInt();
      t[i] = sc.nextInt();
    }
    int min = 1001;
    for(int i = 0;i<n;i++){
      if(t[i]<=tlim){
        min = Math.min(c[i],min);
      }
    }
    if(min>1000){
      System.out.println("TLE");
    }else{
      System.out.println(min);
    }
  }
}
