import java.util.*;

class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                Boolean[] prime = new Boolean[10001];
                prime[0] = prime[1] = true;
                for (int i = 2; i < 10001; i++) {
                        if (prime[i] == false) {
                                int j = 2;
                                while (i * j < 10001) {
                                        prime[i * j] = true;
                                        j++;
                                }
                        }
                }
                while (true) {
                        int N = sc.nextInt();
                        if (N == 0) {
                                return;
                        }
                        while (true) {
                                if (prime[N] == false && prime[N - 2] == false) {
                                        System.out.println(N-2 + " " + N);
                                        break;
                                }
                                N--;
                        }
                }
        }
}