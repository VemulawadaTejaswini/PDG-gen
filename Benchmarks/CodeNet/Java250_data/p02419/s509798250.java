import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    Scanner sc = new Scanner(System.in);

    void solve() {
        String W =  sc.nextLine().toLowerCase();
        int cnt = 0;
        while (true) {
            String[] arr = sc.nextLine().split(" ");
            if (arr[0].equals("END_OF_TEXT")) break;
            for (int i = 0; i < arr.length; ++i) {
                if (arr[i].toLowerCase().equals(W)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}




