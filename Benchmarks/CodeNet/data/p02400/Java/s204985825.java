import java.util.*;
import java.lang.Math;

public class Main{
public static void main(String[] args){
try{
int r = new Scanner(System.in).nextInt();
double S = r * r * Math.PI;
double L = 2 * r * Math.PI;

System.out.printf("%.5f %.5f\n", S, L);

}catch(InputMismatchException e){
System.out.println(e);
}
}
}