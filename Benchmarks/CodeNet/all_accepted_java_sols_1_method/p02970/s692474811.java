import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = a / (b * 2 + 1);
        if (a % (b*2+1) != 0) {
            answer++;
        }
        
        System.out.println(answer);
    }
}
