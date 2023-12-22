import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String s;
        s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                System.out.printf("%c", s.charAt(i) - 'a' + 'A');
            } else if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                System.out.printf("%c", s.charAt(i) - 'A' + 'a');
            } else {
                System.out.printf("%c", s.charAt(i));
            }
        }
        System.out.println();
    }
  
}
