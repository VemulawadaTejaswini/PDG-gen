import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.awt.Point;

class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int[][] map = new int[500][500];


		while(true){
			int roop = scan.nextInt();
			

			for(int i=0;i<500;i++){
				for(int j=0;j<500;j++){
					map[i][j]=0;
				}
			}
			
			map[250][250]=1;
			int count=1;
			HashMap<Integer,Point> pMap = new HashMap<Integer,Point>();
			pMap.put(0,new Point(250,250));


			if(roop==1){
				System.out.println(1+" "+1);
			}else if(roop==0){
				break;
			}else{

				for(int i=0;i<roop-1;i++){	



					int now =scan.nextInt();
					int next = scan.nextInt();
					
						
					Point p =pMap.get(now);	
					
					int x = (int)p.getX();
					int y = (int)p.getY();	
			
					if(next==0){
						map[x-1][y]=1;
						pMap.put(count,new Point(x-1,y));
					}
					else if(next==1){
						map[x][y+1]=1;
						pMap.put(count,new Point(x,y+1));
					}
					else if(next==2){
						map[x+1][y]=1;
						pMap.put(count,new Point(x+1,y));	
					}
					else if(next==3){
						map[x][y-1]=1;
						pMap.put(count,new Point(x,y-1));
					}
					count++;	
				}


				int hMax=0;
				int wMax=0;

				for(int i=0;i<500;i++){
					int wTmp =0,hTmp=0;

					for(int j=0;j<500;j++){
						if(map[i][j]==1){
							wTmp++;			
						}
						if(map[j][i]==1){
							hTmp++;
						}
					}	
					if(wMax<wTmp){
						wMax=wTmp;
					}
					if(hMax<hTmp){
						hMax=hTmp;
					}
				}
				System.out.println(hMax+" "+wMax);
			}
		}


	}

}