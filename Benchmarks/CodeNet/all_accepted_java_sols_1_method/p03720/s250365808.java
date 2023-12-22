import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] ab = new int[m * 2];
        int[] out = new int[n];
        for(int i = 0; i < m * 2; i++){
            ab[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m * 2; j++){
                if(i + 1 == ab[j]){
                    out[i]++;
                }
            }
            System.out.println(out[i]);
        }
    }
}