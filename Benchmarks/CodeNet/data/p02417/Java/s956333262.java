import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count[] = new int[26];
        while(scan.hasNext()) {
            String s;
            s = scan.nextLine();
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                int d = s.charAt(i) - 'a';
                if (d >= 0 && d < 26) {
                    count[d]++;
                }
            }
            
        }
        for (int i = 0; i < 26; i++) {
            System.out.println((char) (i + 'a') + " : " + count[i]);
        }
    }
}

