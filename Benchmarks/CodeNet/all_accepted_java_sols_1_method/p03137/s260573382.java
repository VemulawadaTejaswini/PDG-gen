import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		int[]a=IntStream.range(0,m).map(i->s.nextInt()).sorted().toArray();
		for(int i=m-1;i>0;--i)
			a[i]-=a[i-1];
		System.out.println(IntStream.range(1,m).map(i->a[i]).sorted().limit(Math.max(0,m-n)).sum());
	}
}