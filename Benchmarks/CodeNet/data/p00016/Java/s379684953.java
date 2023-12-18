import java.math.BigInteger;
import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		double X=0,Y=0,t=90;
		while(true){
			String str=sc.next();
			String[] s=str.split(",");
			int r=Integer.parseInt(s[0]);
			int th=Integer.parseInt(s[1]);
			if(r==0 && th==0){
				break;
			}
			X+=r*Math.cos(t*Math.PI/180);
			Y+=r*Math.sin(t*Math.PI/180);
			t-=th;
		}
		ln((int)X);ln((int)Y);
	}

	public static String join(double[] array, String separator) {
		StringBuilder str = new StringBuilder(array[0] + "");
		for (int i = 1; i < array.length; i++) {
			str.append(separator).append(array[i] + "");
		}
		return str.toString();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}