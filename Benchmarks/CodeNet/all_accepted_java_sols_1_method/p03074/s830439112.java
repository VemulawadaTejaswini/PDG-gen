import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);

		int n=s.nextInt(),k=s.nextInt();
		char[]t=s.next().toCharArray();

		ArrayList<Integer>l=new ArrayList<>();
		if(t[0]=='0')
			l.add(0);
		{
			int c=1;
			for(int i=0;i<n;++i) {
				if(i==n-1||t[i+1]!=t[i]) {
					l.add(c);
					c=1;
				}else
					++c;
			}
		}
		if(t[n-1]=='0')
			l.add(0);

		if(k*2+1>=l.size()) {
			System.out.println(t.length);
			return;
		}

		int sum=0,r=0;
		for(int i=0;i<=(k-1)*2;++i)
			sum+=l.get(i);

		for(int i=k*2;i<l.size();i+=2) {
			sum+=l.get(i);
			sum+=l.get(i-1);

			System.err.println(sum);
			r=Math.max(r,sum);

			sum-=l.get(i-k*2);
			sum-=l.get(i-k*2+1);
		}

		System.out.println(r);
	}
}