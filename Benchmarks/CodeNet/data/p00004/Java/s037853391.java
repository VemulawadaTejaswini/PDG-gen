import java.util.*;
import java.text.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int[] k = new int[6];

		for(int i = 0; i < k.length; i++){
			k[i] = sc.nextInt();
		}
		
		TwotwoMatrix p = TwotwoMatrix.inverse(new TwotwoMatrix(k[0], k[1], k[3], k[4]));
		
		double[] q = TwotwoMatrix.multiplytovector(p, k[2], k[5]);
		StringBuffer r = new StringBuffer();
		NumberFormat f = NumberFormat.getInstance();
		
		f.setMaximumFractionDigits(3);
		f.setMinimumFractionDigits(3);
		for(int i = 0; i < q.length; i++){
			String z = f.format(q[i]);
			if(z.equals("-0.000")){
				z = "0.000";
			}
			r.append(z);
			r.append(" ");
		}
		r.delete(r.length(), r.length() + 1);
		System.out.println(r);
		}
	}

}

class TwotwoMatrix{
	int aa, ab, ba, bb;
	double k;
	public TwotwoMatrix(int a1, int a2, int b1, int b2, double k0){
		aa = a1;
		ab = a2;
		ba = b1;
		bb = b2;
		k = k0;
	}

	public TwotwoMatrix(int a1, int a2, int b1, int b2){
		this(a1, a2, b1, b2, 1.0);
	}

	public static TwotwoMatrix multiply(TwotwoMatrix one, TwotwoMatrix two){
		return new TwotwoMatrix(
			(one.aa * two.aa + one.ab * two.ba),
			(one.aa * two.ab + one.ab * two.bb),
			(one.ba * two.aa + one.bb * two.ba),
			(one.ba * two.ab + one.bb * two.bb));
	}

	public static double[] multiplytovector(TwotwoMatrix p, int a, int b){
		double[] res = {(p.aa * a + p.ab * b) * p.k, (p.ba * a + p.bb * b) * p.k};
		return res;
	}

	public static TwotwoMatrix inverse(TwotwoMatrix p){
		int a1, a2, b1, b2;
		a1 = p.aa;
		a2 = p.ab;
		b1 = p.ba;
		b2 = p.bb;
		double n = 1 / (double)(a1 * b2 - a2 * b1) ;

		return new TwotwoMatrix(b2, -a2 , -b1, a1, n);
	}
}