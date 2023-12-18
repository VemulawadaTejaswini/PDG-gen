import java.util.*;

public class Main {


//    public static int gcd(int x, int y){
//        if (y==0) return x;
//        return gcd(y, x%y);
//    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int h[] = new int[n];

        for (int i=0; i<n; i++){
            h[i] = sc.nextInt();
        }

        int origin_count = 1;

        for (int j=1; j<n; j++) {
            int count = 0;

            for (int k = 0; k <= j; k++) {
                if (h[k] > h[j]) {
                    count++;
                }
            }
            if (count==0) {
                origin_count++;
            }
        }
            System.out.println(origin_count);

    }
}


