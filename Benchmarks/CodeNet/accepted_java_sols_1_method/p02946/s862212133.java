
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int max = 1000000;
        int min = -1000000;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        min = Math.max(x-k+1,min);
        max = Math.min(x+k-1,max);
        for(int i=min;i<=max;i++){
            System.out.print(i + " ");
        }
    }
}