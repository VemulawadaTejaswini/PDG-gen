import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    //マスの数
    int n = sc.nextInt();
    int ans = 0;
    for(int i = 1; i <= n;i++){
      //マスの数字
      int a = sc.nextInt();
      if(i % 2 == 1 && a % 2 == 1){
        ans++;
      }
    }
    System.out.println(ans);
  }
}