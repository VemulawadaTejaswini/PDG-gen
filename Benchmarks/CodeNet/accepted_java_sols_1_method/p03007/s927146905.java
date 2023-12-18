import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;++i)
			a[i]=s.nextInt();
		Arrays.sort(a);

		ArrayList<String>r=new ArrayList<>();

		for(int i=n-2;i>0;--i) {
			if(a[i]<=0)
				break;
			r.add(a[0]+" "+a[i]);
			a[0]-=a[i];
			a[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<n-1;++i) {
			if(a[i]==Integer.MAX_VALUE)
				break;
			r.add(a[n-1]+" "+a[i]);
			a[n-1]-=a[i];
		}
		System.out.println(a[n-1]);
		r.forEach(System.out::println);
	}
}