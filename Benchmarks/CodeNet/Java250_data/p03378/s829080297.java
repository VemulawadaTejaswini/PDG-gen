import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[m];
    for(int i = 0;i<m;i++){
      a[i] = sc.nextInt();
    }

    int mae = 0;
    int usiro = 0;
    for(int i = 0;i<m;i++){
      if(a[i] < x){
        mae++;
      }else{
        usiro++;
      }
    }
    int ans = Math.min(mae,usiro);
    System.out.println(ans);
  }
}
