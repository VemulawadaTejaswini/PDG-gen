import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        int count;
        String ss;
        String ans = "";
        if(a.compareTo(b) >0) {
            count = aa;
            ss = b;
        } else {
            count = bb;
            ss = a;
        }
        for(int i=0; i<count; i++) {
            ans += ss;
        }
        System.out.println(ans);
    }
}