import java.util.Scanner;

public class Main{
    public static void main(String args[]){

    Scanner scan = new Scanner(System.in);

    
    //String n2 = scan.next();
    //String s = scan.next();

    int a = scan.nextInt();
    int b = scan.nextInt();

    int h = scan.nextInt();
    int m = scan.nextInt();

    int e1 = (h * 60 + m) * 360 / (12 * 60);
    int e2 = m * 360 / 60;

    int e = Math.abs(e1-e2);

    double r=Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*b*a*Math.cos(Math.toRadians(e)));

    
    System.out.println(r);


      scan.close();
    }
  }