import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        sc.close();

        int sum = 1;
        int cnt = 0;
        while (sum < B) {
            sum += A-1;
            cnt++;
        }
        System.out.println(cnt);
    }
}