import java.io.*;
import java.util.*;
import java.lang.*;
import java.lang.Math;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    double a=Double.parseDouble(scan.next());
    double b=Double.parseDouble(scan.next());
    int c=Integer.parseInt(scan.next());

    double s=a*b*Math.sin(Math.toRadians(c))/2;
    double l=a+b+Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(c)));
    double h=b*Math.sin(Math.toRadians(c));
    System.out.println(s);
    System.out.println(l);
    System.out.println(h);
  }
}
