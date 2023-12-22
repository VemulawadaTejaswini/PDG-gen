import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] k = new int[n - 1];

        for(int i = 1; i <= n - 1; i++){
            for(int j = i + 1; j <= n; j++){
                int min = Math.min(j - i, Math.abs(x - i) + 1 + Math.abs(j - y));
                //System.out.println(i+" "+j+" "+min);
                k[min - 1]++;
            }
        }

        for(int i : k){
            System.out.println(i);
        }
    }
}
