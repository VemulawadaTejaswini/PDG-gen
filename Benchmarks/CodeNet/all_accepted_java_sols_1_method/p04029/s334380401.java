import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int ans = 0;
        
        for (int i=1; i <= n; i++) {
            ans = i + ans;
        }
        System.out.print(ans);
    }

}
