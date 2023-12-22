import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mouth = 1;
        int counter = 0;
        while (mouth < b) {
            mouth += a - 1;
            counter++;
        }
        System.out.println(counter);
        sc.close();
    }
}