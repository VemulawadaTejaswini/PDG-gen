import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    int[] iS = new int[27];
    int[] iT = new int[27];
    
    String ans = "Yes";
    for(int i = 0; i < S.length(); i++){
      int c1 = S.charAt(i)-'a'+1;
      int c2 = T.charAt(i)-'a'+1;
      if(iS[c1] == 0 && iT[c2] == 0){
        iS[c1] = c2;
        iT[c2] = c1;
      }else{
        if(iS[c1] != c2 || iT[c2] != c1){
          ans = "No";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}