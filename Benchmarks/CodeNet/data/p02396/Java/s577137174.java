import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        int n = 1;
        while (sc.hasNext()) {
            int i = sc.nextInt();
            if (i == 0) break;
            
            System.out.println("Case " + n + ": " + i);
            n++;
        }
    }
}