import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int min = 0;
        for (int i = 0; i < n; i++) {
            int x = h[i] -1;
            if(h[i] < min){
                min = -1;
                break;
            }else if(min < x){
                min = x;
            }
        }
        System.out.println(min < 0 ? "No" : "Yes");
        sc.close();

    }

}
