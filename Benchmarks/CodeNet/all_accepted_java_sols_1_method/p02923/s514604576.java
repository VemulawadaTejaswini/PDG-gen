import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cnt,i;
    int max = 0;
    int n = sc.nextInt();
    int[] h = new int[n];
    for(i = 0; i < h.length; i++){
      h[i] = sc.nextInt();
    }
    cnt = 0;
    for(i = 1; i < h.length; i++){
      if(h[i - 1] >= h[i]){
        cnt++;
      }else{
        if(max <= cnt){
          max = cnt;
        }
        cnt = 0;
      }
    }
    if(max <= cnt){
      max = cnt;
    }
    System.out.println(max);
  }
}
