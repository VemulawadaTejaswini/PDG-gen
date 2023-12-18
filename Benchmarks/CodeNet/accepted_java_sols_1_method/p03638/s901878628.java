import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		long[][] t=new long[h][w];
		long[] a = new long[n];
		int h1=0; 
		int w1=-1;
		int one=1;
		for(int i = 0; i<n; i++){
			a[i]=sc.nextLong();
			for(long j = 0; j<a[i]; j++){
				if(w1==w-1 && one==1){
					h1++;
					w1++;
					one=-1;
				}
				if(w1==0 && one==-1){
					h1++;
					w1--;
					one=1;
				}
				w1+=one;
				t[h1][w1]=i+1;
			}
		}
		for(int i=0; i<h; i++){
			if(i!=0){
				System.out.println();
			}
			for(int j=0; j<w; j++){
				System.out.print(t[i][j]+" ");
			}
		}
	}
}