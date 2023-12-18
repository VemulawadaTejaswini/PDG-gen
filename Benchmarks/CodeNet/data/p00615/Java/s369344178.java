import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static int x,y;
	public static int[] xarray,yarray,zarray;
	ArrayList<Integer> zlist=new ArrayList<Integer>();
	public Main(int x,int y){
		xarray=new int[x];
		yarray=new int[y];

	}

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		while(true){
			x=in.nextInt();
			y=in.nextInt();
			if(x==0&&y==0){
				break;
			}
			Main a=new Main(x,y);
			a.conect();

		}

	}

	private void conect() {
		// TODO ?????????????????????????????????????????????
		int i=0;
		int temp=0;
		int ans=0;
		for(;i<x;i++){
			zlist.add(xarray[i]);
		}
		for(;i<y;i++){
			zlist.add(yarray[i]);
		}
		zlist.sort(null);
		for(i=0;i<zlist.size();i++){
			temp=Math.abs(zlist.get(i+1)-zlist.get(i));
			if(ans<temp){
				ans=temp;
			}
		}
		System.out.println(ans);
	}
}