import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if((a&1)==0 && (a%3!=0 && a%5 !=0)){
                System.out.println("DENIED");
                return;
            }
        }
        System.out.println("APPROVED");
    }
}
