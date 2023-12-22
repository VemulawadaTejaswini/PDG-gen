import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());

        double[] arr = new double[n]; //aとの差

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
            double temp = t-arr[i]*0.006;
            arr[i] = Math.abs(a-temp);
        }
        int index = -1;
        double min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min >= arr[i]){
                min = arr[i];
                index = i;
            }
        }
        System.out.println(index+1);
    }
}