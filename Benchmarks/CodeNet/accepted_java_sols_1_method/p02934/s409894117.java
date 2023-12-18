import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0d;
        for (int i = 0; i < n; i++) {
            sum += 1 / sc.nextDouble();
        }
        System.out.println(1 / sum);
        sc.close();
    }
}
