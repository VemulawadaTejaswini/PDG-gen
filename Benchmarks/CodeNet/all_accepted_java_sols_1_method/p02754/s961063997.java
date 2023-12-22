import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        long n, a, b;
        long result = 0;
        long flag;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLong();
        a = scanner.nextLong();
        b = scanner.nextLong();
        flag = n / (a + b);
        result = a * flag;
        flag = n % (a + b);
        if(flag < a){
            result += flag;
        }else{
            result += a;
        }
        System.out.println(result);
    }
}