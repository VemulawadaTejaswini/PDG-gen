import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        double[] a = new double[N];
        double sum = 1.0;
        int keta = 0;
        boolean iszero = false;
        boolean isover = false;
        for(int i=0; i<N; i++) {
            a[i] = Double.parseDouble(sc.next());
            keta += String.valueOf(a[i]).length()-1;
            if(keta >= 18) {
                isover = true;
            }
            if(a[i] == 0) {
                iszero = true;
                break;
            }
        }
        
        Arrays.sort(a);

        for(int i=0; i<N; i++) {
            if(sum >= Math.pow(10, 18) && a[i] > 1) {
                isover = true;
            }
            sum *= a[i];
            if((sum) > Math.pow(10, 18)) {
                break;
            }else {
                continue;
            }
        }
        if(iszero) {
            System.out.println(0);
        }else if(sum <= Math.pow(10, 18)) {
            if(isover) {
                System.out.println(-1);
            }else {
                System.out.println((long)sum);
            }
        }else {
            System.out.println((long)sum);
        }
    }
}
