import java.util.*;
import java.math.*;

class Main{
public static void main(String[] args) {
  Scanner reader =new Scanner (System.in);
  int a =reader.nextInt();
  int b= reader.nextInt();
  int h=reader.nextInt();
  int m=reader.nextInt();

  int min =h*60+m;

  double aRad=(double)(0.5*min%360)*Math.PI/180;

  double bRad=(double)(6*min%360)*Math.PI/180;

  double ax=a*Math.sin(aRad);

  double ay=a*Math.cos(aRad);
  double bx=b*Math.sin(bRad);
  double by=b*Math.cos(bRad);

  double len=Math.pow(ax-bx,2)+Math.pow(ay-by,2);
  double lenans=Math.sqrt(len);
  System.out.println(lenans);




}
}
