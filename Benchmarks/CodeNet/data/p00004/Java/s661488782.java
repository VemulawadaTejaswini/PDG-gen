import java.text.DecimalFormat;

class Main {
public static void main(String[] args){
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
	double d = Double.parseDouble(args[3]);
	double e = Double.parseDouble(args[4]);
	double f = Double.parseDouble(args[5]);
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