import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        boolean[] d = new boolean[10];

        for(int i=0; i<k; i++) {
            d[in.nextInt()] = true;
        }

        loop:
        for(; n<99999; n++) {
            for(int i=1; i<=10000; i*=10) {
                if(n < i) break;
                int l = (n % (i * 10)) / i;
                if(d[l]) {
                    continue loop;
                }
            }
            break;
        }

        System.out.println(n);

        in.close();
    }
}
