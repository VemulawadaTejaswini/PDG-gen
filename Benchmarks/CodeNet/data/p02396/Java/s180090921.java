import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int i = 0;
        while (true) {
            x = scanner.nextInt();
            if (x == 0) break;
            i++;
            System.out.println("Case " + i + ": " + x);
        }
    }
}

