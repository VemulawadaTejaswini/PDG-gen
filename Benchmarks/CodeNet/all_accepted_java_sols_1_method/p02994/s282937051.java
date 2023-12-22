import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            sum += l + i;
            if(Math.abs(l + i) < Math.abs(min)) min = l + i;
        }
        System.out.println(sum - min);
        sc.close();

    }

}
