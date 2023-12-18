import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        solve2149();
    }

    public static void solve2149() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            // ??????????????\???
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int X = sc.nextInt();
            if(N == 0 && A == 0 && B == 0 && C == 0 && X == 0){
                break;
            }
            int nextX = X;
            int frame = 0;
            int Yi = -1;
            for(int i = 0; i < N; i++){
                int nextYi = sc.nextInt();
                while(Yi == nextYi || frame <= 10000 && nextYi != nextX){
                    frame++;
                    nextX = (A * nextX + B) % C;
                }
                Yi = nextYi;
            }
            System.out.println(frame <= 10000 ? frame : -1);
        }
    }
}