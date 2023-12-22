import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        System.out.println((double)4 * l * l * l / 108);
        sc.close();
    }
}