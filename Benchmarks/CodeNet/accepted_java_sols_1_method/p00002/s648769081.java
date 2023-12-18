import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aa = new int[2];
        int i = 1;
        while (sc.hasNext()){
            if (i % 2 != 0) {
                aa[0] = sc.nextInt();
                i++;
            }else {
                aa[1] = sc.nextInt();
                int c = aa[0] + aa[1];
                int digit = 0;
                while (c >= 10){
                    c = c / 10;
                    digit++;
                }
                System.out.println(digit + 1);
                i++;
            }
        }
    }
}

