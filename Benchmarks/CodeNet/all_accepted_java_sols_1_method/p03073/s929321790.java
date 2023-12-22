import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    int n1 =0, n2 = 0;
    for(int i = 0; i < S.length(); i++){
      if((i%2 == 0 && S.charAt(i) == '0') || (i%2 == 1 && S.charAt(i) == '1')){
        n1++;
      }else{
        n2++;
      }
    }
    System.out.println(Math.min(n1, n2));
  }
}