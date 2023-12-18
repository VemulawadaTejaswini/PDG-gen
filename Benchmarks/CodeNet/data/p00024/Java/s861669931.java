import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			double v = in.nextDouble();
			System.out.println((int)((v*v/(9.8*2) + 5)/5 + 0.999));
		}
	}
	
}