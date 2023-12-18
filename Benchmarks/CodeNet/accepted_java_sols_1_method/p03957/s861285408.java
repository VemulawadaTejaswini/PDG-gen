
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] s;
        String m=sc.next();
        s=m.toCharArray();
        boolean c=false;
        boolean f=false;
        for (int i = 0; i < s.length; i++) {
            if (s[i]=='C') {
                c=true;
            }
            if (c&&s[i]=='F') {
                f=true;
            }
        }
        if (c&&f) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
