import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = sc.nextLine();

        char s = 'S';
        char c = 'C';
        char r = 'R';

        int ss = 0;
        int cc = 0;
        int rr = 0;
        int sum = 0;

       for(int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == str2.charAt(i) && str.charAt(i) == s) {
                ss++;
           } else if(str.charAt(i) == str2.charAt(i) && str.charAt(i) == c) {
               cc++;
           } else if(str.charAt(i) == str2.charAt(i) && str.charAt(i) == r) {
               rr++;
           }
       }
	  sum = (ss + cc + rr);
      System.out.println(sum);
    }
}