import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        Data[] data = new Data[n];
        for (int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            data[i] = new Data(arr[i][0], arr[i][1]);
        }

        Arrays.sort(data);

//        System.out.println(data[0].b);

        if (n%2 == 1) {
            System.out.println(data[n%2].b-data[n%2].a+1);
            return;
        }

        int min = data[n/2-1].a + data[n/2].a;
        int max = data[n/2-1].b + data[n/2].b;

        if ((max-min+1)%2!=0) System.out.println((max-min+1));
        else System.out.println(max-min);
    }
    public static class Data implements Comparable<Data> {
        int a, b;
        public Data(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public int compareTo(Data other) {
            if (this.a == other.a) {
                return this.b - other.b;
            } else {
                return this.a - other.a;
            }
        }
    }
}
