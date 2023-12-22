import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        long count = 1000000000000000000l;
        for (int i=0;i<n;i++){
            x[i] = scanner.nextInt();
        }
        for (int i=0;i<100;i++){
            int instance = 0;
            for (int j=0;j<n;j++){
                instance += (x[j]-i)*(x[j]-i);
            }
            if (count>instance){
                count = instance;
            }
        }
        System.out.println(count);

    }

}