import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num;
        int n;

        while ((n = s.nextInt()) != 0) {
            int limit = n * 2 + 1;

            num = new int[limit];
            num[2] = 1;

            for (int i = 3; i < limit; i += 2) {
                if (num[i] != 0) continue;
                num[i] = 1;
                for (int j = i * 2; j < limit; j += i)
                    num[j] = -1;
            }

            int ans=0;

            for(int i=n+1;i<limit;i++){
                if(num[i]==1) ans++;
            }
            System.out.println(ans);
        }

    }
}