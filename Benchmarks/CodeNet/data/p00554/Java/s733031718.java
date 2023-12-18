import java.util.Arrays;
import java.util.Scanner;
public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt(),m=getInt(),p[]=new int[m];
		for(int i=0;i<m;i++) {
			p[i]=getInt();
			s.next();
		}
		System.out.println(Arrays.stream(p).map(i->Math.max(0,n-i)).limit(m-1).sum());
	}
}