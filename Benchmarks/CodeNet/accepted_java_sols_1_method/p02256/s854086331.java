import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int gcd = 1;
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        int i = 2;
        while (i <= a) {
            if (a%i == 0 && b%i == 0) {
                gcd *= i;
                a /= i;
                b /= i;
            } else i++;
        }

        System.out.println(gcd);
    }
}