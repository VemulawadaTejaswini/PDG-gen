import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int out = 0;
        if(k<=a) {
            out += k;
        } else if (a < k && k <= a + b){
            out += a;
        } else {
            out += a - (k - a - b);
        }

        System.out.println(out);
        sc.close();
        
    }
}