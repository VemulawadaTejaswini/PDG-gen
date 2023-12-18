import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	double a = Double.parseDouble(scan.next());
	double b = Double.parseDouble(scan.next());
	double c = Double.parseDouble(scan.next());
	double d = Double.parseDouble(scan.next());
	double e = Double.parseDouble(scan.next());
	double f = Double.parseDouble(scan.next());
	DecimalFormat df = new DecimalFormat("0.000");
	double x =(c*e-b*f)/(a*e-b*d);
	double y = (a*f-c*d)/(a*e-b*d);
	x = Math.floor((x+0.5)*1000)/1000;
	x = Math.ceil((x-0.5)*1000)/1000;
	y = Math.floor((y+0.5)*1000)/1000;
	y = Math.ceil((y-0.5)*1000)/1000;

	System.out.println(df.format(x)+" "+df.format(y) );


}
}