import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            if (s.charAt(s.length()-1)=='s'){
                  s += "es";
            }else {
                  s += "s";
            }
            System.out.println(s);
      }



}
