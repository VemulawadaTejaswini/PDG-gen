import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}
	public static void main(String[]A){
		long[]a={gInt(),gInt(),gInt()};
		Arrays.sort(a);
		for(int i=gInt();i>0;--i)
			a[2]*=2;
		System.out.println(a[0]+a[1]+a[2]);
	}
}
