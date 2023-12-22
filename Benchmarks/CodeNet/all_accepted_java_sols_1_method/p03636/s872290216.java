import java.util.*;

class Main{
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      String S = sc.nextLine();
      String a ;String b;String c;
      a = S.substring(0,1);
      b = S.substring(S.length()-1,S.length());
      System.out.println(a + (S.length()-2) +b);
    }
}
