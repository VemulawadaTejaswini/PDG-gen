import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        //String[] num = str.split(" ",0);
        double a, b;
        double pi = 3.141592653589793;
        a = Double.valueOf(str);
        //b = Integer.valueOf(num[1]);
        System.out.println(String.format("%.6f", (double)a*a*pi) + " " + String.format("%.6f", (double)a*2*pi));
        scan.close();
    }
}
