import java.util.*;
class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=0;
		for(int i=0;i<n;++i)
			r^=s.nextInt();
		System.out.println(r==0?"Yes":"No");
	}
}
