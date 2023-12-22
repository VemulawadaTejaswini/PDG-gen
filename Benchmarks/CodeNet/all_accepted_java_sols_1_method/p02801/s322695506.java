import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cst = sc.next();
        char[] c = cst.toCharArray();


        System.out.println((char)(c[0] + 1));
    }
}
