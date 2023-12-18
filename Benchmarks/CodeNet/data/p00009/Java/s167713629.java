import java.io.*;
 
public class Main {
 
    private static int count;
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (null != (str = in.readLine())) {// 入力の終わりまで
            doit(Integer.parseInt(str));
        }
    }
 
    private static void doit(int n) {
        count = (n>=2)?1:0;
         
        for (int i = 3; i <= n; i+=2)
            if (isPrime(i))count++;
         
        System.out.println(count);
    }
 
    private static boolean isPrime(int n) {// 素数判定メソッド
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
 
        if (n % 2 == 0)
            return false;
 
        for (int i = 3; i <= n / i; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}