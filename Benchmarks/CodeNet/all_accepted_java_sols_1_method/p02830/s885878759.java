import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String a=s.next(),b=s.next();
		char[]c=new char[n*2];
		for(int i=0;i<n;++i) {
			c[i*2]=a.charAt(i);
			c[i*2+1]=b.charAt(i);
		}
		System.out.println(c);
	}
}
