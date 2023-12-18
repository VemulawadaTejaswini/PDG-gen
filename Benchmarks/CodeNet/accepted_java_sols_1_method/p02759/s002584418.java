import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        System.out.println((int) Math.ceil((double) N / 2));
    }
}