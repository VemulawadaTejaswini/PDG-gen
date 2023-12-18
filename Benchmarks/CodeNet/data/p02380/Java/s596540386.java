import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        double a,b,c,d;
        str = scan.nextLine();
        String[] num = str.split(" ", 0);
        a = Double.valueOf(num[0]);
        b = Double.valueOf(num[1]);
        c = Double.valueOf(num[2]);
        c = c/180 * Math.PI;
        //y2 = Double.valueOf(num[3]);
        d = Math.sqrt(a*a+b*b-2*a*b*Math.cos(c));
        System.out.println(a*b*Math.sin(c)/2);
        System.out.println(a+b+d);
        System.out.println(b*Math.sin(c));
        scan.close();
    }
}

