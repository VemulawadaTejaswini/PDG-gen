import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int now = 0;
    boolean check = false;
    String ans = "Yes";
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      if(n <= now-2 || (n < now && !check)){
        ans = "No";
        break;
      }else if(n > now){
        now = n;
        check = true;
      }else if(n < now && check){
        now--;
        check = false;
      }
    }
    
    System.out.println(ans);
  }
}