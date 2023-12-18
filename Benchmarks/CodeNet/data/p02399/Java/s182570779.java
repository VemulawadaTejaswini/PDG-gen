import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aa = sc.nextInt();
        double bb = sc.nextInt();
        int a = (int)aa;
        int b = (int)bb;
        int d = a / b;
        int r = a % b;
        double f = aa / bb;
        System.out.println(d + " " + r + " " + String.format("%.5f", f));
      }
    }

