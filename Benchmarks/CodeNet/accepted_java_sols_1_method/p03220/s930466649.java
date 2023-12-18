import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int N = Integer.parseInt(scan.next());
        int N = Integer.parseInt(scan.next());
        int T = Integer.parseInt(scan.next());
        int A = Integer.parseInt(scan.next());
        int[] h = new int[N];
        double[] ave = new double[N];
        double[] delta = new double[N];
        double tmp = 1000;
        int out=-1;
        for(int i = 0;i<N;i++){
            h[i] = Integer.parseInt(scan.next());
            ave[i] = T-(h[i]*0.006);
        }
        for(int i = 0;i<N;i++){
            delta[i] = Math.abs(A-ave[i]);
            if(tmp>=delta[i]){
                tmp = delta[i];
                out = i;
            }
        }
        System.out.println(out+1);
    }
}