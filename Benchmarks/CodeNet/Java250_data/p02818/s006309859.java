import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] inp = sc.nextLine().split(" ");
        long t = Long.parseLong(inp[0]);
        long a = Long.parseLong(inp[1]);
        long k = Long.parseLong(inp[2]);
        long tmp = 0;
        tmp = k - t;
        t = t - k;
        if(t < 0) {
            t = 0;
            k = tmp;
            a = a - k;
            if(a < 0) {
                a = 0;
            }
        }
        System.out.println(t + " " + a);
    }
}