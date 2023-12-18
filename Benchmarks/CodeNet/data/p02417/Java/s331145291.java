import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");
        int[] atozArray = new int[26];
        int ans;
        char atoz;
        while (sc.hasNext()) {
            String str = sc.nextLine().toLowerCase();
            for (int i = 97; i <= 122; i++) {
                atozArray[i-97] += strCount(str, i);
            }
        }
        for (int i = 97; i <= 122; i++) {
            atoz = (char) i;
            System.out.println(atoz + " : " + atozArray[i-97]);
        }
//        pw.flush();
    }
    
    public static int strCount(String str, int ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        return count;
    }
}
