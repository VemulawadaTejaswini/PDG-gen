import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] times = {
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt()
        };
        int num = 0; 
        for (int t : times) {
            int mod = t % 10;
            if (mod != 0) {
                if (num == 0) {
                    num = mod;
                } else if (num > mod) {
                    num = mod;
                } 
            }
        }

        int total = 0;
        for (int t : times) {
            int mod = t % 10;
            if (mod == 0) {
                total += t;
            } else if (mod == num ){
                total += t;
                num = 0;
            } else {
                total += (t + 10 - mod);
            }
        }
        System.out.println(total);
    }
}