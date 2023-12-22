import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String N = sc.nextLine();
    long K = Long.parseLong(sc.nextLine());
    
    char ans = '1';
    for(int i = 0; i < N.length() && i < K; i++){
      if(N.charAt(i) != '1'){
        ans = N.charAt(i);
        break;
      }
    }
    System.out.println(ans);
  }
}