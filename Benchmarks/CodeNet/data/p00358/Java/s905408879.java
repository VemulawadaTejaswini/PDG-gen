import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		int h=getInt();
		boolean[][]f=new boolean[h][4];
		for(int n=getInt();n>0;--n) {
			int x=getInt(),y=getInt();
			f[y][x]=true;
		}
		//Arrays.stream(f).map(Arrays::toString).forEach(System.err::println);
		/*
		for(int i=0;i<h;++i)
			for(int j=1;j<4;++j)
				if(f[i][j]!=-1)
					f[i][j]=f[i][j-1]+1;
		*/
		int c=0;
		for(int i=1;i<h;++i) {
			for(int j=1;j<4;++j) {
				if(!(f[i-1][j-1]||f[i-1][j]||f[i][j-1]||f[i][j])) {
					f[i][j]=true;
					++c;
				}
			}
		}
		System.out.println(c);
		//Arrays.stream(f).map(Arrays::toString).forEach(System.err::println);
	}
}