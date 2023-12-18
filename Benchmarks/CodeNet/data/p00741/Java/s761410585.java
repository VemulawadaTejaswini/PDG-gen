import java.io.*;
import java.util.*;

public class Main{
	static int maxH=50;
	static int maxW=50;
	static int h;
	static int w;
	static int ans=0;
	static int[][] c=new int[maxH][maxW];
	static boolean[][] notUse=new boolean[maxH][maxW];//counted?
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//input
		while(true){
			w=scan.nextInt();
			h=scan.nextInt();
			if(w==0 && h==0){
				break;
			}
			//starting setting
			ans=0;
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					c[i][j]=scan.nextInt();
					if(c[i][j]==1){
						notUse[i][j]=true;
					}
					else{
						notUse[i][j]=false;
					}
				}
			}
			
			//seeing from Upper Left
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(notUse[i][j]){
						counting(i,j);
					}
				}
			}
			System.out.println(ans);
		}
	}
	
	private static void counting(int i,int j){
		ArrayList<Integer> queH = new ArrayList<Integer>();
		ArrayList<Integer> queW = new ArrayList<Integer>();
		queH.add(i);
		queW.add(j);
		notUse[i][j]=false;
		
		while(queW.size()>0){
			int tempI=queH.get(0);
			int tempJ=queW.get(0);
			queH.remove(0);
			queW.remove(0);
			
			for(int I=-1;I<2;I++){
				for(int J=-1;J<2;J++){
					if(tempI+I<0 || h-1<tempI+I || tempJ+J<0 || w-1<tempJ+J){
						continue;
					}
					if(notUse[tempI+I][tempJ+J]){
						queH.add(tempI+I);
						queW.add(tempJ+J);
						notUse[tempI+I][tempJ+J]=false;
					}
				}
			}
		}
		ans++;
	}
}