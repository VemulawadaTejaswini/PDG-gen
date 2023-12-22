import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float D=sc.nextFloat();
		float T=sc.nextFloat();
		float S=sc.nextFloat();
		float temp=D/S;
		if ( temp<=T)
		System.out.print("Yes");
		else
		System.out.print("No");
	}
}