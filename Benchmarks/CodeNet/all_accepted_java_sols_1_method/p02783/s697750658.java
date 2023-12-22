import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        double h = Double.parseDouble(sc.next());
        double a = Double.parseDouble(sc.next());

        int result = (int)Math.ceil(h / a);
        System.out.println(result);

        sc.close();
    }
}
