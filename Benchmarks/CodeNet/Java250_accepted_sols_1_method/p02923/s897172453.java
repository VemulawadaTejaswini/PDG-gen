import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int h1 = sc.nextInt();
                int cnt = 0, max = 0;
                for(int i = 1; i < N; i++) {
                        int h2 = sc.nextInt();
                        if(h1 >= h2) cnt++;
                        else cnt = 0;
                        if(max < cnt) max = cnt;
                        h1 = h2;
                } 
                sc.close();
                System.out.println(max);
        }
}
