import java.util.Arrays;
import java.util.Scanner;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;

    String s = sc.next();
    for(int i=0; i<s.length();i++){
      if(String.valueOf(s.charAt(i)).equals("o")){
        ans++;
      }
    }
    System.out.println(700 + 100*ans);

    sc.close();
  }
}
