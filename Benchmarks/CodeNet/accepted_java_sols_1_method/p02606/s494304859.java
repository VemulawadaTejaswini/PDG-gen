import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt(),R=sc.nextInt(),d=sc.nextInt();
		System.out.println(R/d-(L-1)/d);
	}
}