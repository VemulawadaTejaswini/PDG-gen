import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int d=sc.nextInt();
		int[][] a=new int[h][w];
		int[] index=new int[h*w+1];
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				a[i][j]=sc.nextInt();
				index[a[i][j]]=w*i+j;
			}
		}
		int magic[]=new int[h*w+1];
		for(int i=1;i<=h*w-d;i++) {
			magic[i]=Math.abs(index[i]/w-index[i+d]/w)+
					Math.abs(index[i]%w-index[i+d]%w);
		}
		
		for(int i=h*w-d;i>=0;i--) {
			magic[i]+=magic[i+d];
		}
		int q=sc.nextInt();
		
		for(int i=0;i<q;i++) {
			
			System.out.println(magic[sc.nextInt()]-magic[sc.nextInt()]);
		}
		
		
	}
}
