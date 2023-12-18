import java.util.Scanner;
import java.text.DecimalFormat;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double men = r * r * 3.141592653589;

        double tyo = r + r;

        double syu = tyo * 3.141592653589;

        DecimalFormat df1 = new DecimalFormat(".000000");

        System.out.println(df1.format(men) + " " + df1.format(syu));
    }
}
