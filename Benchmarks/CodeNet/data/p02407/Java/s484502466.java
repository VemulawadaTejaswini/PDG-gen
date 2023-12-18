import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        for (int a = n-1; a >= 0; a--) {
            array[a] = String.valueOf(sc.nextInt());
        }
        System.out.println(String.join(" ", array));
        sc.close();
    }
}
