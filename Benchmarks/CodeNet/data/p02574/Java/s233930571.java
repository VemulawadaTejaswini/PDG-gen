import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int gcd (int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd (b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] a = new int[n];
        boolean[] res = new boolean[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        int currGCD = a[n-1];
        boolean flag = true;
        for (int i = n-2; i >=0 ; i--) {
            currGCD = gcd(a[i], currGCD);
            if(currGCD != 1)
                flag = false;
        }
        if(flag){
            System.out.println("pairwise coprime");
        }else if(currGCD == 1){
            System.out.println("setwise coprime");
        }else{
            System.out.println("not coprime");
        }
    }
}
