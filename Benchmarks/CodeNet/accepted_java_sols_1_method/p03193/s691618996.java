import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),h=s.nextInt(),w=s.nextInt(),r=0;
		for(int i=0;i<n;++i) {
			boolean b=s.nextInt()>=h;
			boolean c=s.nextInt()>=w;
			if(b&&c)
				++r;
		}
		System.out.println(r);
	}
}
