import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] l=new int[m];
		int[] r=new int[m];
		for(int i=0;i<m;i++){
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
		}
		int maxl=0;
		int minr=n;
		for(int i=0;i<m;i++){
			if(maxl<l[i])
				maxl=l[i];
		}
		for(int i=0;i<m;i++){
			if(minr>r[i])
				minr=r[i];
		}
		int count=0;
		for(int i=1;i<=n;i++){
			if(maxl<=i&&i<=minr)
				count++;
		}
		System.out.println(count);
	}
}