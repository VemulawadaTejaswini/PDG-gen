import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int counter = 0;
        while (n != 0) {
            n /= k;
            counter++;
        }
        System.out.println(counter);
        sc.close();
    }
}