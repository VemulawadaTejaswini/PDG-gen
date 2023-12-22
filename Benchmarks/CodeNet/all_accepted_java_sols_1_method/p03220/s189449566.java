import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double T = sc.nextDouble();
        double A = sc.nextDouble();
        int[] H = new int[N];
        double[] dif = new double[N];
        for(int i = 0; i < N; i++){
            H[i] = sc.nextInt();
            dif[i] = Math.abs(A  - (T - 0.006 * H[i]));
        }

        double min = 100000;
        int minIndex = 0;
        for(int i = 0; i < N; i++){
            if(min > dif[i]){
                min = dif[i];
                minIndex = i;
            } 
        }
        System.out.println(minIndex+1);
    }
}