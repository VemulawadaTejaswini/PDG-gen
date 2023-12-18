import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		long r=0;
		for(String t:s.next().replaceAll("BC","#").split("[BC]+")) {
			long c=0;
			for(int i=t.length()-1;i>=0;--i) {
				if(t.charAt(i)=='#')
					++c;
				else
					r+=c;
			}
		}
		System.out.println(r);
	}
}
