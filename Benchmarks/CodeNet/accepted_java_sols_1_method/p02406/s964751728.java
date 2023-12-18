import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            String a = String.valueOf(i);
            if (i % 3 == 0 || a.contains("3")) {
                System.out.print(" " + i);
            }
        }
        System.out.println("");
    }
}

