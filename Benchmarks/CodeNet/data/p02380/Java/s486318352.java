
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextLong();
        double b=scanner.nextLong();
        double c=scanner.nextInt()*Math.PI/180.0;
        System.out.println(a*b*Math.sin(c)/2);
        System.out.println(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(c))+a+b);
        System.out.println(b*Math.sin(c));
    }

}

