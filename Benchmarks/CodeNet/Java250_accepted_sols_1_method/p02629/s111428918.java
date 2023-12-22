import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        String s = "";
        while(n > 0) {
            long mod = n%26;
            if(mod != 0) {
                char c = (char) (96 + mod);
                s = c + s;
                n = n/26;
            } else {
                s = 'z' + s;
                n = n/26;
                n--;
            }
        }
        System.out.println(s);

    
  }
}
