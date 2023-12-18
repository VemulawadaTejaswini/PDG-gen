import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
      	char c[] = str.toCharArray();
        int answer = 0;
        char now = c[0];
        answer += 1;
        for (int i = 1; i < n; i++) {
            if (now != c[i]) {
              answer++;
              now = c[i];
            }
        }
        System.out.println(answer);
    }
}
