import java.io.*;

public class Main {
	static int cnt=0;
	public static void Merge(int a[],int start,int end){
		if (start>=end) return;
		int center=(start+end)/2;
		Merge(a,start,center);
		Merge(a,center+1,end);
		int[] work=new int[end-start+1];
		int i=0;
		int s=start;
		int e=center+1;
		while (s<=center&&e<=end){
			if (a[s]<=a[e]){work[i++]=a[s++];}else{work[i++]=a[e++];}
			cnt++;
		}
		for(;s<=center;){
			work[i++]=a[s++];
			cnt++;
		}
		for(;e<=end;){
			work[i++]=a[e++];
			cnt++;
		}
		for (int j=start,m=0;m<i;j++,m++){
			a[j]=work[m];
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] str=br.readLine().split(" ");
		int a[]=new int[n];
		for (int i=0;i<n;i++){
			a[i]=Integer.parseInt(str[i]);
		}
		Merge(a,0,n-1);
		for (int i=0;i<n;i++){
			System.out.print(a[i]);
			if (i<n-1) System.out.print(" ");
		}
		System.out.println();
		System.out.println(cnt);
	}
}