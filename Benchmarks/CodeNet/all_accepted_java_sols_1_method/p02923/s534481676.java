import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int[] H = new int[N];
                for(int i = 0; i < N; i++) {
                        H[i] = sc.nextInt();
                } 
                int cnt = 0, max = 0, h = H[0];
                for(int i = 1; i < N; i++) {
                        if(h >= H[i]) cnt++;
                        else cnt = 0;
                        if(max < cnt) max = cnt;
                        h = H[i];
                } 
                sc.close();
                System.out.println(max);
        }
}
