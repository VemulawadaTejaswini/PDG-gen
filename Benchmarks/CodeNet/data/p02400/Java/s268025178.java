import java.io.*;

class Main { 
public static void main (String[] args){
  Scanner scan = new Scanner(System.in);

  int r = scan.nextInt();
  double pi = Math.PI;

  System.out.println(r * r * pi);
  System.out.println(r * 2 * pi);
}
}