import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = (int)Math.log10( (double)(a+b) )+1;
            System.out.println(k);
        }
    }
}