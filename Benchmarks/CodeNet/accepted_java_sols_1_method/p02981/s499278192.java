import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int taxi = b;
        int train = n*a;
        if (taxi < train)
        {
            System.out.println(taxi);
        }
        else {
            System.out.println(train);
        }
    }
}