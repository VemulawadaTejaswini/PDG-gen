
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int c = sc.nextInt();
        final int d = sc.nextInt();

        if(Math.abs(a-c) <= d) {
            System.out.println("Yes");
            return;
        }

        int[] xs = IntStream.of(a, b, c).sorted().toArray();
        if(Math.abs(xs[0]-xs[1])<=d && Math.abs(xs[1]-xs[2])<=d) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}