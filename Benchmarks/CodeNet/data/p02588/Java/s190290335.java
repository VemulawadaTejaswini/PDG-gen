import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double[] num = new double[N];
        for(int i = 0; i < N; i++){
            num[i] = scan.nextDouble();
        }
        int count = 0;
        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                double x = num[i]*num[j];
                int y = (int)(num[i]*num[j]);
                if(x-y == 0) count++;
            }
        }
        System.out.println(count);
    }
}
