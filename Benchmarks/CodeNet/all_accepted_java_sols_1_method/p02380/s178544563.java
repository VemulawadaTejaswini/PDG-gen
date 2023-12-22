import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        double s, l, h;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        h = b*Math.sin(Math.toRadians(c));
        s = a*h/2;
        l = a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c)));
        System.out.println(s);
        System.out.println(l);
        System.out.println(h);
    }
}

