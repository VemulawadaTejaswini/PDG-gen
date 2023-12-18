import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double a = r*r*3.141592653589;
        double b = 2*r*3.141592653589;
        System.out.println (String.format("%.5f", a) + " " + String.format("%.5f", b));
      }
    }

