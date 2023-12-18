import java.util.*;
public class Main{
	private static Scanner sc=new Scanner(System.in);
	public static void  main(String[]agrs){
		int a[][]=new int[14][14];
		while(sc.hasNext()){
		String m=sc.nextLine();
		String[] mm=m.split(",");
		 //System.out.println(mm[0]);
		 int x=Integer.parseInt(mm[0]);
		 int y=Integer.parseInt(mm[1]);
		 int size=Integer.parseInt(mm[2]);
		// System.out.println(x);//
		// System.out.println(y);
		// System.out.println(size);
		 int kx=x+2;
		 int ky=y+2;
		 //System.out.println(kx);
		// System.out.println(ky);
			a[kx][ky]++;
			a[kx+1][ky]++;
			a[kx][ky+1]++;
			a[kx-1][ky]++;
			a[kx][ky-1]++;
		 if(size>=2){
			 a[kx+1][ky+1]++;
			 a[kx-1][ky+1]++;
			 a[kx+1][ky-1]++;
			 a[kx-1][ky-1]++;
		 }
		 if(size>=3){
			 a[kx+2][ky]++;
			 a[kx-2][ky]++;
			 a[kx][ky+2]++;
			 a[kx][ky-2]++;
		}
		}
		int cnt0=0;
		int max=0;
		for(int i=2;i<12;i++){
			for(int j=2;j<12;j++){
			if(a[i][j]==0)cnt0++;
			if(a[i][j]>max)max=a[i][j];
			}
		}
		System.out.println(cnt0);
		System.out.println(max);
		
	
	}
}