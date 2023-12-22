import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),c=0;
		for(int i=0;i<n;++i)
			if(s.nextInt()==c+1)
				++c;
		System.out.println(c==0?-1:n-c);
	}
}
