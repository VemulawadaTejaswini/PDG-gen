import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tokens1[] = scanner.nextLine().split(" ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine().split(" ");
        String tokens3[] = scanner.nextLine().split(" ");
        
        /*
        System.out.println(Arrays.asList(tokens1));
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.asList(tokens3));
        */
        scanner.close();

        if (tokens1[0].equals(tokens3[0])) {
            a--;
        } else {
            b--;
        }
        System.out.println(a + " " + b);
    }
}