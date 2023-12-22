import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    int i;
    for(i=0;i<n;i++){
      h[i] = sc.nextInt();
    }
    int total = 1;
    int num = h[0];
    for(i=1;i<n;i++){
      if(h[i]>=num){
        total = total +1;
        num = h[i];
      }else{
        continue;
      }
    }
    System.out.println(total);    
 }
}