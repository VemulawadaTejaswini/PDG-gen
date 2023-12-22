import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        StringBuilder r = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int ci = (int)c;
            ci+=n;
            if(ci>0x5a) {
                ci = ci - 0x5a + 0x40;
            }
            c = (char)ci;
            r.append(c);
        }
        System.out.println(r.toString());
    }
}
