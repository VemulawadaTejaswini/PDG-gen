import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int l = sc.nextInt();
        System.out.println(d/l+d%l);
    }
}
