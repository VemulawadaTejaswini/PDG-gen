import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int answer = 0;
        if (x == 1) {
            answer += 300000;
        } else if (x == 2) {
            answer += 200000;
        } else if (x == 3) {
            answer += 100000;
        }
        
        if (y == 1) {
            answer += 300000;
        } else if (y == 2) {
            answer += 200000;
        } else if (y == 3) {
            answer += 100000;
        }
        
        if (x == 1 && y == 1) {
            answer += 400000;
        }
        
        System.out.println(answer);
    }
}
