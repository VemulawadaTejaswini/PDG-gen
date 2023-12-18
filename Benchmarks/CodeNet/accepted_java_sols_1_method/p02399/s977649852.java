import java.util.Scanner;
import java.text.DecimalFormat;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int waru = a / b;
        int amari = a % b;
        double syou = (double)a / (double)b;

        DecimalFormat df1 = new DecimalFormat(".00000");

        System.out.println(waru + " " + amari + " " + " " + df1.format(syou));
    }
}
