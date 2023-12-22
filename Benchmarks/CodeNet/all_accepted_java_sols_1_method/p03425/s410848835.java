import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long m = 0;
        long a = 0;
        long r = 0;
        long c = 0;
        long h = 0;
        for (int i = 0 ; i < N ; i++) {
            String s = sc.next();
            char ch = s.charAt(0);
            switch (ch) {
            case 'M':
                m++;
                break;
            case 'A' :
                a++;
                break;
            case 'R' :
                r++;
                break;
            case 'C' :
                c++;
                break;
            case 'H' :
                h++;
                break;
             default:
            }
        }
        long ans = m * a * r + m * a * c + m * a * h + m * r * c +
                m * r * h + m * c * h + a * r * c + a * r * h + a * c * h + r * c * h;
        System.out.println(ans);
    }

}