import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int have,a,b,result;
		have = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		have = have - a;
		result = have % b;
		System.out.println(result);
	}
}