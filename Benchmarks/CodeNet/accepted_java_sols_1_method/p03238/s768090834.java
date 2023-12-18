import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if (age == 1) {
            System.out.println("Hello World");
        } else if (age == 2) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}
