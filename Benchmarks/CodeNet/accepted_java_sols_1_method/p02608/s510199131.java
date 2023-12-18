import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count;
        int num = 130;
        int[] ans = new int[10000];
        Arrays.fill(ans, 0);


        for (int x = 1; x <= num; x++) {
            for (int y = 1; y <= num - x; y++) {
                for (int z = 1; z <= num - x - y; z++) {
                    long temp = (x + y + z) * (x + y + z) - ((x * y) + (y * z) + (x * z));
                    if (temp <= 10000 && temp > 0) {
                        int number = (int) temp;
                        ans[number - 1] += 1;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }


        scn.close();

    }


}
