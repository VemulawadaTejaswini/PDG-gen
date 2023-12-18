import java.util.*;

class Main{
	public static void main(String[] A){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char[]c=s.next().toCharArray();
		int[]l=new int[26],r=new int[26];
		int v=0;
		for(char i:c)
			++r[i-'a'];
		for(char i:c) {
			--r[i-'a'];
			++l[i-'a'];
			int k=0;
			for(int j=0;j<26;++j)
				if(r[j]>0&&l[j]>0)
					++k;
			v=Math.max(v,k);
		}
		System.out.println(v);
	}
}
