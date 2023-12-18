import java.util.*;
public class Main{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		int S = ob.nextInt();
		int W = ob.nextInt();

		if(W >= S){
			System.out.println("unsafe");
		}
		else{
			System.out.println("safe");
		}
	}
}