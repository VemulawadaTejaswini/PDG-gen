import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String abcd = sc.next();
    int n = abcd.length();
    int total = 0;
    String ans = "";
    for(int i = 0; i < Math.pow(2, n - 1); i++){
      //StringBuffer sb = new StringBuffer(abcd);
      //int count = 0;
      total = Integer.parseInt(abcd.substring(0, 1));
      ans = abcd.substring(0, 1);
      for(int j = 0; j < n - 1; j++){
        if((1&i>>j) == 1){
          //sb.insert(j + 1 + count, "+");
          //count++;
          total += Integer.parseInt(abcd.substring(j + 1, j + 2));
          ans += "+" + abcd.substring(j + 1, j + 2);
        }else{
          total -= Integer.parseInt(abcd.substring(j + 1, j + 2));
           ans += "-" + abcd.substring(j + 1, j + 2);
          //sb.insert(j + 1 + count, "-");
          //count++;
        }
      }
      if(total == 7){
        break;
      }
    }
    System.out.println(ans + "=7");
  }
}