import java.util.*;

public class Main {
	public static void main(String args[]){
		double[] r = new double[4];
		
		Scanner scn = new Scanner(System.in);
		String inl = scn.nextLine();
		String[] part = inl.split(" ");
		for(int i = 0 ; i < 4 ; i++){
			r[i] = Double.parseDouble(part[i]);
		}
		System.out.println(Math.sqrt(Math.pow( (r[0] - r[2]) , 2) + Math.pow( (r[1] - r[3]) , 2)));
	}
}