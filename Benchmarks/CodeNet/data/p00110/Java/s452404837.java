import java.util.*;
import java.math.BigInteger;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(sc.hasNext()){
      String[] s = sc.next().split("\\+|=");
      int ans = -1;

      for(int i=0;i<10;i++){
        if(i == 0 && ( s[0].length() > 1 && s[0].charAt(0) == 'X' ||
                       s[1].length() > 1 && s[1].charAt(0) == 'X' ||
                       s[2].length() > 1 && s[2].charAt(0) == 'X' )) continue;
        BigInteger a = new BigInteger(s[0].replaceAll("X",""+i));
        BigInteger b = new BigInteger(s[1].replaceAll("X",""+i));
        BigInteger c = new BigInteger(s[2].replaceAll("X",""+i));

        if(a.add(b).equals(c)){
          ans = i;
          break;
        }
      }

      if(ans == -1) System.out.println("NA");
      else System.out.println(ans);
    }
  }
}