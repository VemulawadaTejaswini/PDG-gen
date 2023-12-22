import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Y = sc.nextInt();

        for (int i=0; i<N+1; i++) {
            for (int j=0; j<N+1-i; j++) {
                if (10000*i + 5000*j + 1000*(N - i - j) == Y) {
                    System.out.println(i + " " + j + " " + (N - i - j));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}

