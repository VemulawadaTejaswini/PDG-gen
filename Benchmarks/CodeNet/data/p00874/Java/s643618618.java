import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int w=sc.nextInt(), d=sc.nextInt();
			if(w==0 && d==0) break;

			int[] a=new int[w], b=new int[d];
			for(int i=0;i<w;i++) a[i]=sc.nextInt();
			for(int i=0;i<d;i++) b[i]=sc.nextInt();

			Arrays.sort(a);
			Arrays.sort(b);

			int ans = 0;
			int i=0, j=0;
			while(true){
				if(i == w && j == d) break;
				else if(i == w){ans+=b[j++];continue;}
				else if(j == d){ans+=a[i++];continue;}
				else if(a[i] == b[j]){ans+=a[i++];j++;}
				else if(a[i] > b[j]) ans+=b[j++];
				else ans+=a[i++];
			}

			System.out.println(ans);
		}
	}
}