import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws IOException {
	  Scanner in = new Scanner(System.in);
	  int a = in.nextInt();
	  int b = in.nextInt();
	  int h = in.nextInt();
	  int m = in.nextInt();
	  double hh = (double)h/12*360;
	  //System.out.println(hh);
	  double mm = (double)m/60*360;
	  //System.out.println(mm);
	  hh += (double)m/60*30;
	  //System.out.println(hh);
	  double angle = Math.abs(mm-hh);
	  if(angle > 180.0) {
		  angle = 360.0-angle;
	  }
	  //System.out.println(angle);
	  double ans;
	  if(angle == 0.0) {
		  ans = Math.abs(b-a);
	  }else if(angle == 180.0) {
		  ans = a+b;
	  }else {
		  //System.out.println(Math.cos(90.0));
		  ans = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(angle)));
	  }
	  System.out.println(ans);
  }
}