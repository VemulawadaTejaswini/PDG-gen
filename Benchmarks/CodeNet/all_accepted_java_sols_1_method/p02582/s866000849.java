import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String t = scan.next();
    int maxCnt = 0;
    int currentCnt = 0;
    for (int i = 0; i < t.length(); i++){
      if(t.charAt(i) == 'R'){
        currentCnt++;
      }else{
        currentCnt = 0;
      }
      maxCnt = Math.max(maxCnt, currentCnt);
    }
    System.out.println(maxCnt);
  }
}