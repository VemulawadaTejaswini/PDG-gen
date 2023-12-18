import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
    
        int first, second, third;
        if (a>=b && b>=c) 
            first = a; second = b; third = c;
        elseif (a>=b && b<=c && a<=c)
            first = c; second = a; third = b;
        elseif (a>=b && b<=c && a>=c)
            first = a; second = c; third = b;
        elseif (a<=b && b<=c)
            first = c; second = b; third = a;
        elseif (a<=b && b>=c && a>=c)
            first = b; second = a; third = b;
        elseif (a<=b && b>=c && c>=a)
            first = b; second = c; third = a;

        System.out.println(third + " " + second + " " + third);
    }
}