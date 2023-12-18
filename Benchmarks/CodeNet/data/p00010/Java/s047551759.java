import java.io.*;

import java.util.*;
import java.math.*;
import java.text.*;



class Main{
	private static double my_pow(double a){
		return a*a;	
	}

	private static ArrayList<Double> calc_circ(ArrayList<Double> p){

		ArrayList<Double> res = new ArrayList<Double>();

		double x1,x2,x3,y1,y2,y3,a,b,c,r,xc,yc,a1,b1,c1,a2,b2,c2,a3,b3,c3;
		

		for(int i = 0;i<p.size()/6;i++){

			x1=p.get(i*6);
			y1=p.get(i*6+1);

			x2=p.get(i*6+2);
			y2=p.get(i*6+3);
			x3=p.get(i*6+4);

			y3=p.get(i*6+5);
			a = Math.sqrt(my_pow(x1-x2)+my_pow(y1-y2));
			b = Math.sqrt(my_pow(x2-x3)+my_pow(y2-y3));
			c = Math.sqrt(my_pow(x1-x3)+my_pow(y1-y3));
			r = (a*b*c)/(Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)));
			a1 = 2*(x2-x1);
			b1 = 2*(y2-y1);
			c1 = my_pow(x1)-my_pow(x2)+my_pow(y1)-my_pow(y2);
			a2 = 2*(x3-x1);
			b2 = 2*(y3-y1);
			c2 = my_pow(x1)-my_pow(x3)+my_pow(y1)-my_pow(y3);
			xc = (b1*c2-b2*c1)/(a1*b2-a2*b1);
			yc = (c1*a2-c2*a1)/(a1*b2-a2*b1);
			res.add(xc);
			res.add(yc);
			res.add(r);

		}

		return res;

	}

	private static void print_circ(ArrayList<Double> a){
		String format = "0.000";

		DecimalFormat decimalFormat = new DecimalFormat( format );

		String str1,str2,str3;
		double x,y,r;		

		for(int i = 0;i<a.size()/3;i++){
			x = a.get(i*3);

			y = a.get(i*3+1);
			r = a.get(i*3+2);

			str1 = Double.toString(x);

			str2 = Double.toString(y);
			str3 = Double.toString(r);			
			
			BigDecimal bigDecimal1 = new BigDecimal( str1 );

			BigDecimal bigDecimal2 = new BigDecimal( str2 );			
			BigDecimal bigDecimal3 = new BigDecimal( str3 );

			BigDecimal Result1 = bigDecimal1.setScale(4,BigDecimal.ROUND_HALF_UP);

			BigDecimal Result2 = bigDecimal2.setScale(4,BigDecimal.ROUND_HALF_UP);
			BigDecimal Result3 = bigDecimal3.setScale(4,BigDecimal.ROUND_HALF_UP);


			System.out.println( decimalFormat.format( Result1 ) + " " + decimalFormat.format( Result2 ) + " " + decimalFormat.format( Result3 ) );

		}

	}

		public static void main(String args[]) throws IOException{

			ArrayList<Double> tri = new ArrayList<Double>();

			Scanner scan = new Scanner(System.in);

			

			int a;

			

			a = Integer.parseInt(scan.next());

			

			for(int i = a;i > 0;i--){

				for(int j = 0;j<6;j++){

					String str1 = scan.next();

					tri.add(Double.parseDouble(str1));

				}

			}

			ArrayList<Double> res = new ArrayList<Double>();

			res = calc_circ(tri);

			print_circ(res);

	}

}