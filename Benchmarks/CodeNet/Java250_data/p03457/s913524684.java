import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine()) + 1;
        int[] t = new int[N];
        int[] x = new int[N];
        int[] y = new int[N];
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;
        for(int i = 1 ; i < N ; i++) {
            String[] str = stdR.readLine().split(" ");
            t[i] = Integer.parseInt(str[0]);
            x[i] = Integer.parseInt(str[1]);
            y[i] = Integer.parseInt(str[2]);
        }
        boolean isok = true;
        for(int i = 0 ; i < N - 1 ; i++) {
            int time = t[i + 1] - t[i];
            int distance = Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]);
            if(!(time >= distance && time % 2 == distance % 2)) {
                isok = false;
                break;
            }
        }
        if(isok) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
