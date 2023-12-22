import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       double tate = scan.nextDouble();
       double yoko = scan.nextDouble();
       double S;
       double tubo;
       
       S = tate*yoko;
       tubo = S / 3.305785 ;
       System.out.printf("%.6f",tubo);

    }

}

