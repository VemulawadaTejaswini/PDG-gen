
import java.util.Scanner;

/**
 * Created by ??\??? on 2016/12/2.
 */
public class Main {
    static boolean[] tony(int n)
    {
        boolean[] array = new boolean[n];
        for(int i = 0;i<n;i++)
        {
            array[i] = true;
        }
        array[0] = false;
        array[1] = false;
        for(int i = 2;i<= Math.sqrt((double)n);i++)
        {
            if(array[i]) {
                int j = i + i;
                while (j < n) {
                    array[j] = false;
                    j = j + i;
                }
            }
        }
        return array;
    }
    static int run(String[] args)
    {
        boolean[] tony = tony(100000000);
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int T = Integer.parseInt(scan.nextLine());
            int ans = 0;
            for (int i = 0; i < T; i++) {
                if (tony[scan.nextInt()])
                    ans++;
            }
            System.out.println(ans);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        run(args);
    }
}