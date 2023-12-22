import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();
        int count = 0;
        for(int i=0; i<len/2; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(len - i - 1);
            if(c1 != c2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
