import java.util.Scanner;
  public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String N = scan.next();
      String M = "";
      int cnt = 0;
      for(int i=N.length(); i>0; i--){
        M = N.substring(i-1,i);
        cnt += Integer.parseInt(M);
      }
      if(cnt%9==0){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }