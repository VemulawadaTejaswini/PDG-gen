import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = s;
        if(s.length() == 3) {
            byte[] a = s.getBytes();
            byte[] r = new byte[]{a[2],a[1],a[0]};
            res = new String(r);

        }

        System.out.println(res);
    }
}