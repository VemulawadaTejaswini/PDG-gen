
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i=0; i<b; i++) {
            s1.append(a);
        }
        for(int i=0; i<a; i++) {
            s2.append(b);
        }

        if(s1.toString().compareTo(s2.toString()) < 0) {
            System.out.println(s1.toString());
        } else {
            System.out.println(s2.toString());
        }

    }
}
