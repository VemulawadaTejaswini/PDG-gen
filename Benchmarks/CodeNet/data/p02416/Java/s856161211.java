import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String x;
    int S = 0;
    while(true){
      x = sc.next();
      if(x.equals("0")){
        break;
      }
      for(int i=0;i<x.length();i++){
        S += x.charAt(i) - '0';
      }
      System.out.println(S);
      S = 0;
    }
  }
}
