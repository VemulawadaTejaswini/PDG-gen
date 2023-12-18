import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		int n=s.nextInt();
		StringBuilder b=new StringBuilder(n);
		for(int i=0;i<n;++i)
			b.append(Integer.parseInt(s.next()));
		String c=b.toString();
		for(int i=0;i>=0;++i) {
			if(b.indexOf(String.valueOf(i))<0) {
				System.out.println(i);
				return;
			}
		}
	}
}
