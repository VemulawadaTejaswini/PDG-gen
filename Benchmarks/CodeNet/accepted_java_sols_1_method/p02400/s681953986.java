import java.util.Scanner;
 
class Main {
 
public static void main(String[] args) {
 
Scanner inp = new Scanner(System.in);
 
double r = inp.nextDouble();

System.out.printf("%.10f %.10f\n", Math.PI*Math.pow(r, 2), Math.PI*2*r );
 
}
}
