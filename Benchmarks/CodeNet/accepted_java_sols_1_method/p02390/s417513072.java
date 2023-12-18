import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int h,m,s;
        s = S % 60;
        m = S / 60;
        h = m / 60;
        m = m % 60;
        System.out.println( h + ":" + m + ":" + s );
      }
    }

