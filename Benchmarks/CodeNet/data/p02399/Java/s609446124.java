import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float aa = sc.nextInt();
        float bb = sc.nextInt();
        long a = (long)aa;
        long b = (long)bb;
        long d = a / b;
        long r = a % b;
        float f = aa / bb;
        System.out.println(d + " " + r + " " + f);
      }
    }
