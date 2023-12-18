import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shoya on 2017/04/12.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        PrintWriter pwout = new PrintWriter(System.out);
        for(Integer i : rabinKarp(str2, str1))
            pwout.println(i);
        //pwout.flush();
        return;
    }

    static ArrayList<Integer> rabinKarp(String str1, String str2){
        ArrayList<Integer> list = new ArrayList<>();
        if (str1.length() > str2.length())
            return list;

        final long RADIX = Long.parseUnsignedLong("100000007");
        long t = 1, str1hash = 0, str2hash = 0;
        for (int i = 0; i < str1.length(); i++) {
            t *= RADIX;
            str1hash = str1hash * RADIX + str1.charAt(i);
            str2hash = str2hash * RADIX + str2.charAt(i);
        }
        for (int i = 0; i + str1.length() <= str2.length(); i++) {
            //System.out.println(Long.toUnsignedString(str1hash));
            //System.out.println(Long.toUnsignedString(str2hash));
            //System.out.println();
            if (str1hash == str2hash)
                list.add(i);
            if (i + str1.length() < str2.length()) {
                str2hash = str2hash * RADIX + str2.charAt(i + str1.length()) - str2.charAt(i) * t;
                //System.out.println(Long.toUnsignedString(str2hash));
            }
        }
        return list;
    }
}