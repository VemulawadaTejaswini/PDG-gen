import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println("1");
            } else if (n == 1) {
                System.out.println("0");
            }
        }
    }
}