import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        double total_prob = 0.0;
        for (int start=1; start<N+1; start++) {
            int total = start;

            int count = 0;
            while (!(total==0 || total>=K)) {
                total *= 2;
                count++;
            }
            total_prob += (double)1/N * Math.pow(0.5, count);
        }
        System.out.println(total_prob);
    }
}