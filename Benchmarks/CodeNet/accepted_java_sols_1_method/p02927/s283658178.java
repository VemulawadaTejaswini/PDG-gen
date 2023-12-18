
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = 0;
        for (int i = 1;i <=a; i++) {
            for (int j = 1; j <= b; j++) {
                int p = j%10;
                int q = j/10;
                if(p>=2 && q>=2){
                if (p*q==i) {
                    n++;
                }}
            }
        }
        System.out.println(n);
    }

}
