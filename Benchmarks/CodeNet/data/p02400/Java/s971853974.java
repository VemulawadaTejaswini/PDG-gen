import java.io.*;
import java.util.*;

class Main { 
public static void main (String[] args){
  Scanner scan = new Scanner(System.in);

  double r = scan.nextDouble();
  double x = Math.PI;

  System.out.println(r * r * x * 1.0);
  System.out.println(r * 2 * x * 1.0);
}
}