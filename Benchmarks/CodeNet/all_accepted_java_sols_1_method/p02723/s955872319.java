import java.util.*;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

   String str = sc.next();
// System.out.print(str.charAt(1));  テスト

  if(str.charAt(2) == str.charAt(3) && str.charAt(4) == str.charAt(5)) {
       System.out.print("Yes");
} else {
      System.out.print("No");
}


}
}