import java.util.Scanner;

public class colon {
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      String n = scan.next();
	      String[] data =n.split(",");
	      System.out.println(data[0]+" "+data[1]);
	      double a = Double.parseDouble(data[0]);
	      double b = Double.parseDouble(data[1]);
	      double h = Double.parseDouble(data[2]);
	      double m = Double.parseDouble(data[3]);
	      double tyou =h*30;
	      double tan = m*6;
	      double kaku;
	      if(tyou>=180) {
	    	  tyou=tyou-180;
	      }
	      if(tan>=180) {
	    	  tan=tan-180;
	      }
	      if(tyou>=tan) {
	    	  kaku = tyou-tan;
	      }else {
	    	  kaku = tan-tyou;
	      }
	      double cosa = Math.cos(Math.toRadians(kaku));
	      double an = a*a+b*b-2*a*b*cosa;
	      double ans =Math.sqrt(an);
	      System.out.println(ans);
	}
}
