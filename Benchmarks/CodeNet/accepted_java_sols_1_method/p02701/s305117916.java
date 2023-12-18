import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Set<String> types = new HashSet<>();
        for (int i=0; i<N; i++) {
            types.add(scanner.next());
        }
        System.out.println(types.size());
    }
}