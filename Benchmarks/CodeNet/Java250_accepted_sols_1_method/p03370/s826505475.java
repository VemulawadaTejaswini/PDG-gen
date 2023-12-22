import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int i = 0;
        int min = 1001;
        int sum = 0;
        int prev;
        int ans = N;
        while(i < N){
            prev = sc.nextInt();
            sum += prev;
            if(prev < min){
                min = prev;
            }
            i++;
        }
        X -= sum;
        ans += X/min;
        System.out.println(ans);

    }
}
