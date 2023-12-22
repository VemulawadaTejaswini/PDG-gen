import java.util.Scanner;
import java.text.DecimalFormat;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat d1 = new DecimalFormat("0.00000");
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.print(a/b+" "+a%b+" ");
        System.out.println(d1.format(((double)a)/b));
    }
}

