import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        int d = a / b, r = a % b;
        double f = (a * 1.0) / (b * 1.0);
        System.out.println(d + " " + r + " " + f);
    }
}
