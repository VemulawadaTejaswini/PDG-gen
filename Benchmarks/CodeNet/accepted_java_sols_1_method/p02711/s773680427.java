import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // 番号の取得
    String numStr = sc.next();

    if (numStr.contains("7")) {
	    System.out.println("Yes");
    } else {
	    System.out.println("No");
    }
  }
}