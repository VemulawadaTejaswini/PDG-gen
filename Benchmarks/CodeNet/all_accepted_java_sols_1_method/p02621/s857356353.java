import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int res = (int) ((int) a + Math.pow(a, 2) + Math.pow(a, 3));
        System.out.println(res);

    }

}