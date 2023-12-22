//package A;
//A - Circle
import java.util.Scanner;

public class Main {
    private Main(int r){
        System.out.println(r*r);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        Main result = new Main(r);
    }
}
