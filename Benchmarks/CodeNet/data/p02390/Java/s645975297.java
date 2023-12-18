
import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int x= n/3600,  y= x%3600/60,  z= n%60;

		System.out.println(x +":"+ y +":"+ z);
	}
}