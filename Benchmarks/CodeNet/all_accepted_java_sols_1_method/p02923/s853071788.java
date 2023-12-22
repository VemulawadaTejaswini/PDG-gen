import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

        int[] h = new int[n];
        int[] map = new int[n];
        int max = 0;
        int x;

        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }

        map[n-1] = 0;
        for(int i = 2; i < n+1; i++){
            x = h[n-i+1];
            if(x <= h[n-i]){
                map[n-i] = map[n-i+1] + 1;
                max = Math.max(max, map[n-i]);
            }
            else map[n-i] = 0;
        }

        System.out.println(max);

    }

}
