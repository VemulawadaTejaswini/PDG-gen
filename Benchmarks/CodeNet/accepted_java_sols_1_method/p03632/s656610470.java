import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int [4];
    for(int i = 0;i<4;i++){
      a[i] = sc.nextInt();
    }
    int an = Math.max(a[0],a[2]),bn = Math.min(a[1],a[3]);
    int ans = bn - an;
    if(ans < 0){
      ans = 0;
    }
    System.out.println(ans);
  }
}
