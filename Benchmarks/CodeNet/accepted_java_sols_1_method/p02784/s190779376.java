import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tairyoku = scanner.nextInt();
        int hissatsuwazashurui = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < hissatsuwazashurui; i++) {
            sum+= scanner.nextInt();
        }
        if (tairyoku>sum){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }

    }
}
