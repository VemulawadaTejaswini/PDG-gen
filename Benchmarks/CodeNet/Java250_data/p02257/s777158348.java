import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.lang.model.util.ElementScanner6;

class Main {
    public static boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            int[] nums = new int[n];
            int count = 0;

            for (int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                if (isPrime(nums[i]))
                    count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
