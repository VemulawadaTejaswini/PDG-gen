import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        int count = 0;
        String[] num = in.readLine().split(" ");
        a = Integer.parseInt(num[0]);
        b = Integer.parseInt(num[1]);
        c = Integer.parseInt(num[2]);
        if (a > b) {
           throw new RuntimeException("error:You must write a<=b");
        }
        if (a < 1 || 10000 < a || b < 1 || 10000 < b || c < 1 || 10000 < c) {
             throw new RuntimeException("error:You must write 1<=a,b,c<=10000");
        }
        for (int i = a; i <= b; i += 1) {
            if (c % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}