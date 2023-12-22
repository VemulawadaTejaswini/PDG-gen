import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		long w=s.nextInt();
		long h=s.nextInt();
		long x=s.nextInt();
		long y=s.nextInt();
		System.out.println(w*h*0.5+" "+(x*2==w&&y*2==h?1:0));
	}
}