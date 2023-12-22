import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[100100];
        int[] x    = new int[100100];
        int[] y    = new int[100100];
        for(int i = 0; i < n; i++) {
            time[i + 1] = sc.nextInt();
            x[i + 1]    = sc.nextInt();
            y[i + 1]    = sc.nextInt();
        }
        boolean can = true;
        for( int i = 0; i < n; i++) {
            int dt = time[i+1] - time[i];
            int dist = Math.abs(x[i+1] -x[i]) + Math.abs(y[i+1] -y[i]);
            if(dt < dist) {
                can = false;
                break;
            }
            if(dist % 2 != dt %2) {
                can = false;
                break;
            }
        }
        String ans = "No";
        if(can) ans = "Yes";
        System.out.println(ans);
    }
}
