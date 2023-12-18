//package A;
//A - Air Conditioner
import java.util.Scanner;

public class Main {
    int temperature;
    public abc_174(int temperature) {
        this.temperature = temperature;
        if (this.temperature >= 30)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            Main tanver = new Main(n);
        }
    }
}
