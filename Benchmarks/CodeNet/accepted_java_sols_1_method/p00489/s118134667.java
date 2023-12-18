import java.util.Scanner;
public class Main{
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		int x=sc.nextInt();
		
		int [][]  wl = new int [x][3];
		int [] rs = new int [x];
		int i,j,c=1;
		
		for(i=0;i<x*(x-1)/2;i++){
			int vsa =sc.nextInt();
			int vsb =sc.nextInt();
			int wla =sc.nextInt();
			int wlb =sc.nextInt();
		
			if(wla>wlb) wl[vsa-1][1]=wl[vsa-1][1]+3;
			else if(wla<wlb) wl[vsb-1][1]=wl[vsb-1][1]+3;
			else if(wla==wlb){
				wl[vsa-1][1]++;
				wl[vsb-1][1]++;
			} 
		}
		
		for(i=0;i<x;i++){
			wl[i][2]=1;
			for(j=0;j<x;j++){
				if(wl[j][1]>wl[i][1]) wl[i][2]++;
			}
		}
		
		for(i=0;i<x;i++){
			System.out.printf("%d\n",wl[i][2]);
		}
		
		sc.close();
		System.exit(0);
	}
}