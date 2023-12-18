import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println(k%2==0 ? (k*k)/4 : ((k+1)*(k-1))/4);
	}
}