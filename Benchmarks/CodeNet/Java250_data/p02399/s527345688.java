
import java.util.*;
import java.text.*;

class Main{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
	  int a = s.nextInt();
	  int b = s.nextInt();
	  int d = a / b;
	  int r = a % b;
	  double f = (double)a / (double)b;
	  
	  DecimalFormat fm = new DecimalFormat("#.######");
      System.out.println(d+" "+r+" "+fm.format(f));
	 }
	}