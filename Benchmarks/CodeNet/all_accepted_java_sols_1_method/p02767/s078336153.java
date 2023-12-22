import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int x[] = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            if (max < x[i]) {
                max = x[i];
            }
        }

        int min = 0;
        int pow = 0;
        int sum = 0;

        for (int i = 0; i <= max; i++) {
            sum = 0;
            for(int j = 0; j <n; j++){
                pow = (x[j] - i)*(x[j] - i);
                sum = sum + pow;
            }
            if(i==0 || min > sum){
                min = sum;
            }
        }

        System.out.println(min);
        sc.close();
    }
}