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
        int i = 1;
        while (i > 0) {
            if (a%(a/i) == 0 && b%(a/i) == 0) {
                System.out.println(a/i);
                return;
            } else {
                i++;
            }
        }

        
    }
}