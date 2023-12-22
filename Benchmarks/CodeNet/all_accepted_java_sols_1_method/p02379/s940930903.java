import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x1,y1,x2,y2;
        double d;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        x1 -= x2;
        y1 -= y2;

        d = Math.sqrt(x1*x1+y1*y1);
        System.out.println(d);
    }
}

