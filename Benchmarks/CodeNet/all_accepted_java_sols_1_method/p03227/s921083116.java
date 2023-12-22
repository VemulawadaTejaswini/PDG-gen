import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String re = s;

        if (s.length() == 3) {
            char[] c = new char[3];
            c[0] = s.charAt(2);
            c[1] = s.charAt(1);
            c[2] = s.charAt(0);
            re = String.valueOf(c);
        }
        
        System.out.println(re);
    }
}