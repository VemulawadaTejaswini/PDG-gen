
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        System.out.println(temperature>=30 ? "Yes": "No");
    }
}
