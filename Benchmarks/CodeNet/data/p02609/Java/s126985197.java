import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String X = sc.next();
        int counter = 0;//counter
        
        for (int i = 0; i < N; i++) {
            int X_new;
            if (X.charAt(i) == 0) {
                X_new = (int) Integer.parseInt(X.substring(0, i) + "1" + X.substring(i+1, N));
            } else {
                X_new = (int) Integer.parseInt(X.substring(0, i) + "0" + X.substring(i+1, N));
            }

            counter = 0;
            while (X_new!= 0) {
                X_new %= popcount(X_new);
                counter++;
            }
            System.out.println(counter);
        }
    }

    private static int popcount(int x) {
        int n = (String.valueOf(x)).length();
        int value = 0;
        int j;
        for (int i = 0; i < n; i++) {
            if (x % (int)Math.pow(10, i + 1) != 0) {
                j = 1;
            } else {
                j = 0;
            }
            value += j;
            x -= j * (int) Math.pow(10, i);
        }
        return value;
    }
}