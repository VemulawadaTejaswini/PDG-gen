import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                int[] ms = new int[n];
                for(int i = 0; i < n; i++){
                    ms[i] = sc.nextInt();
                }
                int sum = 0;
                int min = Integer.MAX_VALUE;
                int mini = 0;
                for(int i=0; i<n; i++){
                    sum += ms[i];
                    if(min > ms[i]){
                        min = ms[i];
                        mini = i;
                    }
                }
                int rest = x - sum;
                int restX = rest / min;
                System.out.println(n + restX);
            }
        }
    }
}