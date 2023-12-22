import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String S = scanner.next();
    long K = scanner.nextLong();
    char ans = '1';
    for(int i = 0; i < Math.min(S.length(), K); i++){
      if(S.charAt(i)!='1'){
        ans = S.charAt(i);
        break;
      }
    }
    System.out.println(ans);
  }
}