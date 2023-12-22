import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // B - xxxxx

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        byte[] bs = s.getBytes();
        HashSet<Byte> setB = new HashSet<>();

        for (byte b : bs) {
            setB.add(b);
        }

        byte sb = "a".getBytes()[0];
        String ans = "None";
        for (int i = 0; i < 26; i++) {
            if (!setB.contains(sb)) {
                //                System.out.println(sb);
                //                System.out.println((char)sb);
                ans = String.valueOf((char) sb);
                break;
            }
            sb++;
        }
        System.out.println(ans);

    }

}