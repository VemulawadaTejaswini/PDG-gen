import java.util.*;
import java.io.*;
class Main {
	public static void main(String...args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] zahyos = br.readLine().split(" ");
		double[] coor = new double[4];
		coor[0] = Double.valueOf(zahyos[0]); 
		coor[1] = Double.valueOf(zahyos[1]); 
		coor[2] = Double.valueOf(zahyos[2]); 
		coor[3] = Double.valueOf(zahyos[3]); 
		double a = Math.pow(coor[2] -coor[0] , 2);
		double b = Math.pow(coor[3] -coor[1] , 2);
		double c = a + b;
		double hypo = Math.sqrt(c);
		System.out.println(hypo);
	}
}

