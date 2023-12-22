import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] in = new int[5];
        in[0] = scan.nextInt();
        in[1] = scan.nextInt();
        in[2] = scan.nextInt();
        in[3] = scan.nextInt();
        in[4] = scan.nextInt();

        int sum = 0;
        int max = 0;
        for (int i = 0; i < in.length; i++) {
            sum +=Math.round((int)Math.ceil((double)in[i]/10) * 10);
            if (10-in[i]%10 == 10) {
                continue;
            }
            max = Math.max(max,10-in[i]%10);
        }
        System.out.println(sum - max);
    }
}
