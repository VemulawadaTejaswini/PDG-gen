import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int m = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;
        int ones = 0;
        int tens = 0;

        if(d > 21) {
            for(int i = 22; i <= d; i++) {
                ones = i % 10;
                tens = i / 10;
                if(ones > 1) {
                    if(ones * tens <= m) {
                        count++;
                    }
                }

            }
        }
        //System.out.println(ones + " " + tens);
        System.out.println(count);

    }

}
