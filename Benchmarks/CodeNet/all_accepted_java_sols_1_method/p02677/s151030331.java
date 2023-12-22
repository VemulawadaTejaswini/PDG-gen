import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double h = scanner.nextDouble(); //* Math.PI / 180; //短針
        double m = scanner.nextDouble(); //* Math.PI / 180; //長針
        double hx = h * 30 + 0.5 * m;
        double mx = m * 6;
        double diff = Math.abs(hx-mx);
        System.out.println(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(diff))));
    }
}

