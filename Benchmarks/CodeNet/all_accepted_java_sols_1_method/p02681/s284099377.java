import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        String b;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        String new_b = "";
        new_b = b.substring(0,a.length());
        if(a.equals(new_b))
        {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
