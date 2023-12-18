import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] x = new double[N];
        String[] s = new String[N];
        float sum = 0;
        for(int i = 0; i<N; i++) {
            x[i] = sc.nextDouble();
            s[i] = sc.next();
            if(s[i].equals("BTC")) {
                sum += x[i]*380000.0;
            }else {
                sum += x[i];
            }
        }
        System.out.println(sum);
    }
}