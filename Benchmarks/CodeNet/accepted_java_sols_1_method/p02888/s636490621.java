import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]l=new int[n];
		Arrays.setAll(l,i->s.nextInt());
		Arrays.sort(l);

		int p=0;
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				for(int k=j+1;k<n;k++)
					if(l[j]-l[i]<l[k]&&l[k]<l[i]+l[j])
						++p;

		System.out.println(p);
	}
}
