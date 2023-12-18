import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int diffCount = 0;
        int len = s.length();
        for(int i=0; i<len; i++) {
            if(s.charAt(i) != t.charAt(i)) {
                diffCount++;
            }
        }
        System.out.println(diffCount);
    }
}
