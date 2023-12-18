import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			//input
			int w=scan.nextInt();
			int h=scan.nextInt();
			if(w==0 && h==0)break;
			int[][] wallUD=new int[h][w-1];
			int[][] wallLR=new int[h-1][w];
			for(int i=0;i<h-1;i++){
				for(int j=0;j<w-1;j++){
					wallUD[i][j]=scan.nextInt();
				}
				for(int j=0;j<w;j++){
					wallLR[i][j]=scan.nextInt();
				}
			}
			for(int j=0;j<w-1;j++){
				wallUD[h-1][j]=scan.nextInt();
			}
			
			//variable height*1000+width=place
			int[][] distance=new int[h][w];
			int step=2;
			ArrayList<Integer> nowPlace=new ArrayList<Integer>();
			ArrayList<Integer> nextPlace=new ArrayList<Integer>();
			
			//Start data
			nowPlace.add(0);
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					distance[i][j]=0;
				}
			}
			
			while(nowPlace.size()>0 && distance[h-1][w-1]==0){
				//see all
				for(int i=0;i<nowPlace.size();i++){
					int UD=nowPlace.get(i)/1000;
					int LR=nowPlace.get(i)%1000;
					//see up
					if(UD>0   && wallLR[UD-1][LR]==0 && distance[UD-1][LR]==0){
						distance[UD-1][LR]=step;
						nextPlace.add((UD-1)*1000+LR);
					}
					//see down
					if(UD<h-1 && wallLR[UD][LR]==0   && distance[UD+1][LR]==0){
						distance[UD+1][LR]=step;
						nextPlace.add((UD+1)*1000+LR);
					}
					//see left
					if(LR>0   && wallUD[UD][LR-1]==0 && distance[UD][LR-1]==0){
						distance[UD][LR-1]=step;
						nextPlace.add(UD*1000+LR-1);
					}
					//see right
					if(LR<w-1 && wallUD[UD][LR]==0   && distance[UD][LR+1]==0){
						distance[UD][LR+1]=step;
						nextPlace.add(UD*1000+LR+1);
					}
					//System.out.println(UD+" "+LR);
				}
				//make next
				nowPlace.clear();
				for(int i=0;i<nextPlace.size();i++){
					nowPlace.add(nextPlace.get(i));
				}
				nextPlace.clear();
				step++;
			}
			//output
			System.out.println(distance[h-1][w-1]);
		}
	}
}