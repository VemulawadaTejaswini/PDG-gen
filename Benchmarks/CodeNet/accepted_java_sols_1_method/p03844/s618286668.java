import java.util.*;
public class Main {
 
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String inputTxt = sc.nextLine();

    int ans = 0;
    String[] arrTxt = inputTxt.split(" ");
    int left = Integer.parseInt(arrTxt[0]);
    int right = Integer.parseInt(arrTxt[2]);
    if ("+".equals(arrTxt[1])) {
      ans = left + right;
    } else {
      ans = left - right;
    }
    System.out.println(ans);
  }
}