import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int max=-1;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			max=(max<a[i])?a[i]:max;
		}
		int middle=max/2;
		int mind=Integer.MAX_VALUE;
		int minnum=-1;
		boolean ishanten=false;
		for(int i=0;i<n;i++) {
			ishanten=false;
			if(a[i]>middle) {
				a[i]=max-a[i];
				ishanten=true;
			}
			int buf=middle-a[i];
			if(buf<=mind) {
				mind=buf;
				if(ishanten) {
					a[i]=max-a[i];
				}
				if(max>a[i]) {
					minnum=a[i];
				}

			}
		}
		/*		int l=max;
		int r=mind;
		long ans=1;
		ArrayList<Integer> amari=new ArrayList<>();
		for(int i=0;i<r;i++) {
			ans*=l-i;
			if(ans%(i+1)==0) {
				ans/=(i+1);
			}else {
				amari.add(i+1);
			}
			for(int j=0;j<amari.size();j++) {
				int wari=amari.get(j);
				if(ans%wari==0) {
					ans/=wari;
					amari.remove(j);
				}
			}
		}*/
		System.out.println(max+" "+minnum);
	}
}