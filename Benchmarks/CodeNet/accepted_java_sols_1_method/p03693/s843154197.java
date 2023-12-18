import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        String[] arr = new String[n];
        String count = "";

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
            count += arr[i];
        }
        int result = Integer.parseInt(count);

        if(result % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
