import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[4];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.sort(a);
		int[]b= {1,4,7,9};
		System.out.println(
				Arrays.equals(a,b)?"YES":"NO"
				);
	}
}