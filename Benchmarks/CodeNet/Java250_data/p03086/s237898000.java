import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String S = s.nextLine();
    int count = 0,ans = 0;

    for(int i = 0; i < S.length(); i++){
      if(S.charAt(i) == 'A' || S.charAt(i) == 'C' || S.charAt(i) == 'G' || S.charAt(i) == 'T'){
        count++;
        if(ans < count){
          ans = count;
        }
      }
      else{
        count = 0;
      }
    }
    System.out.println(ans);
  }
}
