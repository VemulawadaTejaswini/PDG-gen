import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < N;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            sum = sum + Math.abs(l - r) + 1;
        }
        System.out.println(sum);
    }
}