import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] w = new int[n];
        int s1 = 0;
        int s2 = 0;
        int sub;
        int min = 10000000;
        for (int i = 0; i < n; i++) {
            w[i] = stdIn.nextInt();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j <= i) {
                    s1 += w[j];
                } else {
                    s2 += w[j];
                }
            }
            sub = Math.abs(s2 - s1);
            if(sub < min) {
                min = sub;
            }
            s1 = 0;
            s2 = 0;
        }
        System.out.println(min);
    }
}