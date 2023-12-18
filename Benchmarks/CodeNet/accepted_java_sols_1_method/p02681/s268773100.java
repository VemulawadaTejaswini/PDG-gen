import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        if ((s1 != null) && (s1.length() > 0)) {
           s1 = s1.substring(0, s1.length() - 1);
         }
        if(s.equals(s1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
