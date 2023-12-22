import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int A = scan.nextInt();

        int[] H = new int[N];
        for(int i=0; i<N; i++){
            H[i] = scan.nextInt();
        }

        int C = (T-A)*1000/6;
        int min = 99999;
        int calc;
        int answer = 0;

        for(int j=0; j<N; j++){
            calc = Math.abs(H[j] - C);
            if (calc < min) {
                min = calc;
                answer = j;
            }
        }

        System.out.println(answer + 1);
    }
}
