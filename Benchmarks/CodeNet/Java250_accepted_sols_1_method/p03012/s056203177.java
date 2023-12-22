import java.util.*;

public class Main {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w[] = new int[n];

        int sums[] = new int[n-1];

        for (int i=0; i<n; i++){
            w[i] = sc.nextInt();
        }


        for (int t=0; t<n-1; t++) {
            int s1 = 0;
            int s2 = 0;
            for (int x = 0; x < t + 1; x++) {
                s1 += w[x];
            }
            for (int y=t+1; y<n; y++) {
                s2 += w[y];
            }

            int ans = Math.abs(s1-s2);
            sums[t] = ans;

        }

        int max = sums[0];
        int min = sums[1];
        for (int z=1; z<sums.length; z++){
            int v = sums[z];
            if (v > max) max=v;
            if (v < min) min=v;
        }

        System.out.println(min);


        }

    }



