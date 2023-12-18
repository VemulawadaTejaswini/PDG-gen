import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for(int i=1; i<n+1; i++){
            int c1 = i % 10;
            int p = c1;
            if(i-c1 != 0){
                int c2 = (i-c1) % 100;
                p = p + c2/10;
                if(i-(c2+c1) != 0){
                    int c3 = (i-(c2+c1)) % 1000;
                    p = p + c3/100;
                    if(i-(c1+c2+c3) != 0){
                        int c4 = (i-(c2+c1+c3)) % 10000;
                        p = p + c4/1000;
                        if(i-(c1+c2+c3+c4) != 0){
                            int c5 = (i-(c2+c1+c3+c4));
                            p = p + c5/10000;
                        }
                    }
                }
            }
            if(p >= a && p <= b ){
                sum = sum + i;
            }
        }

        System.out.println(sum);


    }
}
