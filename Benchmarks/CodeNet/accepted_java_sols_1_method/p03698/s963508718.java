
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int[] a = new int[27];

        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }
        int flag = 0;
        for (int i = 0; i < 27; i++) {
            if(a[i] >= 2)flag = 1;
        }


        if(flag == 1){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }

    } // mainMethod


} // MainClass
