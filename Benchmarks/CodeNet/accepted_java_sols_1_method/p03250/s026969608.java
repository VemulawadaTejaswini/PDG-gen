import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args){
		int a[]= {s.nextInt(),s.nextInt(),s.nextInt()};
		Arrays.sort(a);
		System.out.println(a[2]*10+a[1]+a[0]);
	}
}