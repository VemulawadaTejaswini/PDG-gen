import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int t = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.print(t*s >= d? "Yes" : "No");
    }
}