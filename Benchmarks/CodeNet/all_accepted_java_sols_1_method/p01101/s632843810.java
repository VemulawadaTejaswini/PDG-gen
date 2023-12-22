import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i,j,n,m,max;
		while(true) {
			n=scan.nextInt();
			m=scan.nextInt();
			if(n==0 && m==0) {
				break;
			}
			
			int[] goods=new int[n];
			for(i=0;i<n;i++) {
				goods[i]=scan.nextInt();
			}
			max=0;
			for(i=0;i<n-1;i++) {
				for(j=i+1;j<n;j++) {
					if(goods[i]+goods[j]>=max && goods[i]+goods[j]<=m) {
						//System.out.println(goods[i]+" "+goods[j]+" "+max);
						max=goods[i]+goods[j];
					}
				}
			}
			if(max==0) {
				System.out.println("NONE");
			}
			else {
				System.out.println(max);
			}
		}
		scan.close();
	}
}
