import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hp = scanner.nextInt();
        int kinds = scanner.nextInt();
        int[] a = new int[kinds];
        for(int i = 0; i < kinds; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
 
        int sum = 0;
        for(int _a : a) {
            sum += _a;
        }
 
        System.out.println(hp <= sum ? "Yes" : "No");
    }
}