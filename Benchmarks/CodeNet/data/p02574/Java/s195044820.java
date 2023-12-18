import java.io.*;
import java.util.*;

public class Main {
    public static int gcd(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(buffer.readLine());
        String [] inp = buffer.readLine().split(" ");
        int [] arr = new int[n];
        arr[0] = Integer.parseInt(inp[0]);
        int gcdRes = arr[0];
        for (int pos = 1; pos < n; pos++) {
            arr[pos] = Integer.parseInt(inp[pos]);
            gcdRes = gcd(gcdRes, arr[pos]);
        }

        int [] factorCnts = new int[1000001];
        boolean checkCoprime = true;
        for (int pos = 0; pos < n; pos++) {
            for (int fact = 2; fact*fact <= arr[pos]; fact++) {
                if (arr[pos]%fact==0) {
                    if (factorCnts[fact]==1){
                        checkCoprime = false;
                        break;
                    }
                    factorCnts[fact]++;
                    int div = arr[pos]/fact;
                    if (div!=fact) {
                        if (arr[div]==1){
                            checkCoprime = false;
                            break;
                        }
                        factorCnts[div]++;
                    }
                }
            }
            if (!checkCoprime)
                break;
        }
        if (checkCoprime){
            System.out.println("pairwise coprime");
        }
        else if (gcdRes==1)
            System.out.println("setwise coprime");
        else
            System.out.println("not coprime");
    }
}
