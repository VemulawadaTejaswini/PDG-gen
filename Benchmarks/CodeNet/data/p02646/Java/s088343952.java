import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();
        String answer = "NO";
        
        if (w < v) {
            if (Math.abs(a - b) <= (v - w) * t) {
                answer = "YES";
            }
            if ((a < b) && (1000000000 - b <= w * t) && (1000000000 - a - (w * t - (1000000000 - b))<= v * t)) {
                answer = "YES";
            }
            if ((b < a) && (1000000000 + b <= w * t) && (1000000000 + a - (w * t - (1000000000 + b)) <= v * t)) {
                answer = "YES";
            }
        } else {
            if ((a < b) && (1000000000 - b <= w * t) && (1000000000 - a - (w * t - (1000000000 - b))<= v * t)) {
                answer = "YES";
            }
            if ((b < a) && (1000000000 + b <= w * t) && (1000000000 + a - (w * t - (1000000000 + b)) <= v * t)) {
                answer = "YES";
            }
        }
        System.out.println(answer);
    }
}