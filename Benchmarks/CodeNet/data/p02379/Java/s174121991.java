import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x1,y1,x2,y2;
        double d;
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        x1 -= x2;
        y1 -= y2;

        d = Math.sqrt(x1*x1+y1*y1);
        System.out.println(d);
    }
}

