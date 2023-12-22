import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // long K = sc.nextLong();
        // int[] A = new int[N];
        int max = -1;
        int min = 1000000001;
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            if(a>max){
                max = a;
            }
            if(a<min){
                min = a;
            }
        }

        System.out.println(max - min);
        
        sc.close();

    }
}      