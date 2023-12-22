import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        HashSet<Integer> result = new HashSet<>();
        result.add(a);
        result.add(b);
        result.add(c);

        System.out.println(result.size());
    }
}
