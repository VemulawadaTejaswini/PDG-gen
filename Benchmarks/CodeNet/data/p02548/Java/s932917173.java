import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        
        for(int B = 1 ; B < N ; B++){
            ans += (N-1)/B;
        }

        System.out.println(ans);
    }
}
