import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] c = S.toCharArray();
        byte[] ascii = S.getBytes("US-ASCII");
        byte[] newAscii = new byte[S.length()];

        for(int i=0;i<S.length();i++){
            newAscii[i] = (byte)((ascii[i]+N-'A')%(26) + 'A');
        }
        System.out.println(new String(newAscii,"US-ASCII"));

    }
}