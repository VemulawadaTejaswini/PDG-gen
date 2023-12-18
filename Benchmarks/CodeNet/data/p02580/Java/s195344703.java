
import java.util.*;
import java.io.*;
public class Main{
static double scale=Math.pow(10, 6);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
				int h=sc.nextInt();
				int w=sc.nextInt();
				int m=sc.nextInt();
				int a[][]=new int[h][w];
				int fr[]=new int[h];
				int fc[]=new int[w];
				for(int i=0;i<m;i++) {
					int x=sc.nextInt()-1;
					int y=sc.nextInt()-1;
					fr[x]++;
					fc[y]++;
					a[x][y]=1;
				}
				int max=Integer.MIN_VALUE;
				int r=0;
				for(int i=0;i<fr.length;i++) {
					if(fr[i]>max){
						max=fr[i];
						r=i;
					}
				}	int c=0;
				int maxq=Integer.MIN_VALUE;
				for(int i=0;i<fc.length;i++) {
					if(fc[i]>maxq){
						maxq=fc[i];
						c=i;
					}
				}
				int ans=0;
//				System.out.println(Arrays.deepToString(a));
//				System.out.println(Arrays.toString(fr));
//				System.out.println(Arrays.toString(fc));
				for(int i=0;i<w;i++) {
					if(a[r][i]==1) {
						ans++;
					
					}
				}
				for(int i=0;i<h;i++) {
					if(a[i][c]==1) {
						ans++;
					}
				}
				if(max!=maxq)
			System.out.println(ans);
				else
					System.out.println(ans-1);
			
			
	
	}


	

}
