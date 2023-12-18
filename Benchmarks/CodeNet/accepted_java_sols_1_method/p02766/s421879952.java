import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nk = sc.nextLine();

        int N = Integer.parseInt(nk.split(" ")[0]);
        int K = Integer.parseInt(nk.split(" ")[1]);

        int t = N;
        int ans = 1;
        while(true) {
            if(t / K == 0){
                break;
            }
            t = t / K;
            ans++;
        }

        System.out.println(ans);
    }
}
