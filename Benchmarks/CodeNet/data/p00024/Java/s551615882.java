import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			double v = in.nextDouble();
			double h = v*v/98+1;
			int a = (int)h;
			if(a==h) System.out.println(a);
			else System.out.println(a+1);
		}
	}
}