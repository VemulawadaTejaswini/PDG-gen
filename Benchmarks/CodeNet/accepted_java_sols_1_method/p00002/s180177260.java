import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Integer sum = sc.nextInt() + sc.nextInt();
            System.out.println(sum.toString().length());
        }
    }
}