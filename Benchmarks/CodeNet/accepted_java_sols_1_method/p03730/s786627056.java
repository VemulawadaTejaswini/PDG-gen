import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
    int result = 0;
    int ans = 0;
    for(int i = 0;i < b;i++){
      result = (a * i) % b;
      if(result == c){
        ans = 1;
        break;
      }
    }
    if(ans == 1){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
