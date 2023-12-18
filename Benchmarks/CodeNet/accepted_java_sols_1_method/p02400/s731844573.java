import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
    double r=Double.parseDouble(sc.next());
    double S=Math.pow(r, 2)*Math.PI;
    double R=2*r*Math.PI;
    System.out.printf("%.5f",S);System.out.print(" ");System.out.println(R);
}
}
