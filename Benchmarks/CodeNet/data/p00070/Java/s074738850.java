import java.util.Scanner;

class Main {
	static boolean next_permutation(int[] a){
		return next_permutation(a.length,a);
	}
	//nPr as=[0,1,…,r]
	static boolean next_permutation(int n,int[] a){
		int r=a.length;
		boolean[] used=new boolean[n];
		//endpoint
		for(int i=0;i<r;i++)used[a[i]]=true;

		//back
		for(int p=r-1;p>=0;p--){
			for(int j=a[p]+1;j<n;j++){
				if(used[j])continue;
				// finded up value
				used[a[p]]=false;used[j]=true;a[p++]=j;
				// fill
				for(int s=0;s<n&& p<r;s++){
					if(used[s])continue;

					used[a[p]]=false;used[s]=true;a[p++]=s;
				}
				return true;
			}
			used[a[p]]=false;
		}
		return false;
	}


	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			int n=sc.nextInt(),s=sc.nextInt();

			int[] per=new int[n];
			for(int i=0;i<n;i++)per[i]=i;

			int res=0;
			do{
				int sum=0;
				for(int i=0;i<n;i++)
					sum+=per[i]*(i+1);
				if(sum==s)res++;
			}while(next_permutation(10,per));

			ln(res);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}