import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int n=stdin.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		int d[]=new int[n];



		int i,j,k;
		int friend=0;
		for(i=0;i<n;i++){
			a[i]=stdin.nextInt();
			b[i]=stdin.nextInt();
		}
		for(i=0;i<n;i++){
			c[i]=stdin.nextInt();
			d[i]=stdin.nextInt();
		}
		for(i=0;i<n;i++){
			int minblueindex=300;
			int minbluevalue=300;
			for(j=0;j<n;j++){
				if(minbluevalue>c[j]){
					minbluevalue=c[j];
					minblueindex=j;
				}
			}
			int maxredindex=-1;
			int maxredvalue=-1;
			for(j=0;j<n;j++){
				if(a[j]<c[minblueindex] &&b[j]<d[minblueindex]){

					if(maxredvalue<b[j]){
						maxredvalue=b[j];
						maxredindex=j;
					}
				}
			}
			c[minblueindex]=300;
			d[minblueindex]=300;
			if(maxredindex!=-1){
				friend++;
				a[maxredindex]=-1;
				b[maxredindex]=-1;
			}
		}
		System.out.println(friend);
	}
}