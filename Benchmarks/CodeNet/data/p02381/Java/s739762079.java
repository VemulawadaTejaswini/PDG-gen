import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, sum;
        int[] s;
        double dev, ave;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n != 0) {
            s = new int [n];
            sum = 0;
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
                sum += s[i];
            }
            ave = sum / n;
            dev = 0;
            for (int i = 0; i < n; i++) 
                dev += (s[i] - ave) * (s[i] - ave);
            System.out.println(Math.sqrt(dev / n));
            n = sc.nextInt();
        }
    }
}
