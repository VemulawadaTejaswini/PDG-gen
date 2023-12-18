import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        long a=sc.nextLong();
        long c=a-1;
        String m="";
            while (a != 0&&c>=0) {
                char n=(char)(c % 26 + 'a');
                m = n + "" + m;
                c/=26;
                c--;
                a /= 26;
            }
            System.out.print(m);
    }
}
