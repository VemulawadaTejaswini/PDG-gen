import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int maxCakeNum = N / 4;
        int maxDonutsNum = N / 7;
        for(int i = 0; i <= maxCakeNum; i++) {
            for(int j = 0; j <= maxDonutsNum; j++) {
                if((i*4)+(j*7) == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}