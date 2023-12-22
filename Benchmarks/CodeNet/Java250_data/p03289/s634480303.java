import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    String subs = s.substring(2,s.length()-1);
    boolean flg = true;
    int countC = 0;
    if(!s.substring(0,1).equals("A"))
      flg = false;
    for(int i=0; i<subs.length(); i++) {
      if(subs.charAt(i)=='C')
        countC++;
    }
    if(countC!=1)
      flg = false;
    for(int i=1; i<s.length(); i++) {
      if(!s.substring(i,i+1).equals("C") && Character.isUpperCase(s.charAt(i)))
         flg = false;
    }
    System.out.println(flg==false?"WA":"AC");
  }
}