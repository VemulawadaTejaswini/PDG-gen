import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int T = sc.nextInt();
		int S = sc.nextInt();
		double time = (double)D/(double)S;
		if((double)T >= time) System.out.println("Yes");
		else System.out.println("No");
	}
}