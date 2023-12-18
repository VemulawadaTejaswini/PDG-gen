import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        if(k%2==0 || k%5==0){
            System.out.println("-1");
        }
        else {
                long num = 0;
                long num2 = 0;
                for (long a = 0; a < 100000000; a++) {
                    num = num2 * 10;
                    num2 = (long) num;
                    num2 = num2 + 7;
                    if (num2 % k == 0) {
                        System.out.println(a + 1);
                        break;
                    }
                    else{
                        System.out.println("-1");
                        break;
                    }
                }
                scan.close();
        }
    }
}