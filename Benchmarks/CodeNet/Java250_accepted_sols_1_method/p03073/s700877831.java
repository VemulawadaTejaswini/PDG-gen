import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chs = str.toCharArray();
        int evenCnt = 0; // even digit is 0
        int oddCnt = 0; // odd digit is 0

        for(int i = 0; i < chs.length; i++) {
          if(i % 2 == 0) {// even digit
            if(chs[i] == '1')
              evenCnt++;
            else
              oddCnt++;
          } else { // odd digit
            if(chs[i] == '0')
              evenCnt++;
            else
              oddCnt++;
          }
        }
        System.out.println(Math.min(evenCnt, oddCnt));
    }
}