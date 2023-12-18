import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.print(String.format("%.6f",(double)r * r * ((double)Math.PI)) + " ");
		System.out.println(String.format("%.6f",(double)r * 2 * ((double)Math.PI)));
	}
}