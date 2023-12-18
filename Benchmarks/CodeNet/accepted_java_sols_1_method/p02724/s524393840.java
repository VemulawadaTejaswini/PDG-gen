import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int ure500=0;
		int ure5=0;
		int j=0;
		int k=0;
		
		j=X/500;
		X-=500*j;
		
		k=X/5;
		
		ure500=j*1000;
		ure5=k*5;
		
		System.out.println(ure500+ure5);
		
	}
}
