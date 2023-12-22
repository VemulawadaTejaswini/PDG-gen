import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] ratio = new int[n][2];
        for(int i=0;i<n;i++){
            ratio[i][0] = Integer.parseInt(sc.next());
            ratio[i][1] = Integer.parseInt(sc.next());
        }

        long t = 1;
        long a = 1;
        for(int i=0;i<n;i++){
            int rt = ratio[i][0];
            int ra = ratio[i][1];
            long bia = Math.max(((t+rt-1)/rt), ((a+ra-1)/ra));
            t = rt * bia;
            a = ra * bia;
        }
        System.out.println(a+t);
    }
}