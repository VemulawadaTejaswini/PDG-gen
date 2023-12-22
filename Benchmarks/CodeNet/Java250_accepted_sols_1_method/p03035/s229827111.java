import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int price = sc.nextInt();
        if (age >= 13) {
            System.out.println(price);
        } else if (age <= 12 && age >= 6) {
            System.out.println(price / 2);
        } else {
            System.out.println(0);
        }
    }
}
