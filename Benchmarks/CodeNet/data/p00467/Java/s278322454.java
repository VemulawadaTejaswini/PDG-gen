import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		while(true){
			int n=getInt(),m=getInt();
			if(n+m==0)return;
			boolean f=true;
			int p=0,a[]=INS(n).toArray();

			for(int i=1;i<=m;++i) {
				p+=getInt();
				if(p<n)
					p+=a[p];
				if(f&&p>=n-1){
					f=false;
					System.out.println(i);
				}
			}
		}
	}
}