import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] w = new int[n];
        for(int i = 0; i < n; i++) w[i] = scan.nextInt();
        int out = 10000;
        for(int i = 0; i < n; i++){
            int s1 = 0;
            int s2 = 0;
            for(int j = 0; j < n; j++){
                if(j <= i) s1 += w[j];
                else s2 += w[j];
            }
            if(out > Math.abs(s1 - s2)) out = Math.abs(s1 - s2);
        }
        System.out.println(out);
        scan.close();
    }
}
