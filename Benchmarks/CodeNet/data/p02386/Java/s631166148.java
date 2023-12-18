
import java.util.*;

class Main {
	 
	public static void main(String[] args) {
		
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int samed=0;
		
		//dices init
		Dice[] dices=new Dice[n];
		for(int i=0;i<n;i++) {
			dices[i]=new Dice();
			Dice dice=new Dice();
			for(int j=0;j<6;j++) dice.SurfaceNum[j]=cin.nextInt();
			dices[i]=dice;
			/*for(int j=0;j<6;j++)System.out.print(dices[i].SurfaceNum[j]+" ");
			System.out.println();*/
			
		}

		
		for(int i=0;i<n-1;i++) {
			
			Dice dice1=dices[i];
			
			/*for(int j=0;j<6;j++)System.out.print(dice1.SurfaceNum[j]+" ");
			System.out.println();
			for(int j=0;j<6;j++)System.out.print(dice2.SurfaceNum[j]+" ");
			System.out.println();*/
			
			for(int j=i+1;j<n;j++) {
				
				Dice dice2=dices[j];
				boolean jd=false;
				
				for(int k=0;k<6;k++) {
					
					dice1.findTop(dice1.SurfaceNum[k]);
					
					//System.out.println(i);
					
					if(!dice2.findTop(dice1.SurfaceNum[dice1.gridX[0]-1])) {
						//System.out.println("No1");
						continue;
					}
					
					if(dice2.adjustBehind(dice1.SurfaceNum[dice1.gridY[3]-1])) {
						
						int c=0;
						
						for(int l=1;l<4;l++) {
							if(dice1.SurfaceNum[dice1.gridX[l]-1]==dice2.SurfaceNum[dice2.gridX[l]-1]) c++;
						}
						
						if(c==3 && dice1.SurfaceNum[dice1.gridY[1]-1]==dice2.SurfaceNum[dice2.gridY[1]-1]) jd=true;
						//System.out.println(c);
					}
					if(jd)break;
				}
				
				if(jd)samed++;
			}
		}
		//System.out.println(samed);
		if(samed==0)System.out.println("Yes");
		else System.out.println("No");
		
	}
}


class Dice {
	int SurfaceNum[]=new int[6];
	
	int gridX[]= {1,3,6,4},gridY[]= {1,5,6,2};
	
	int temp=1,temp2=1,i=0,move=0;
	
	void rotateDice(char odr) {
		if(odr=='N') {
			temp=gridY[3];
			System.arraycopy(gridY, 0, gridY, 1, gridY.length-1);
			gridY[0]=temp;
			gridX[0]=gridY[0];
			gridX[2]=gridY[2];
		}
		else if(odr=='S') {
			temp=gridY[0];
			System.arraycopy(gridY, 1, gridY, 0, gridY.length-1);
			gridY[3]=temp;
			gridX[0]=gridY[0];
			gridX[2]=gridY[2];
		}
		else if(odr=='E') {
			temp=gridX[3];
			System.arraycopy(gridX, 0, gridX, 1, gridX.length-1);
			gridX[0]=temp;
			gridY[0]=gridX[0];
			gridY[2]=gridX[2];
		}
		else if(odr=='W') {
			temp=gridX[0];
			System.arraycopy(gridX, 1, gridX, 0, gridX.length-1);
			gridX[3]=temp;
			gridY[0]=gridX[0];
			gridY[2]=gridX[2];
		}
		
		else if(odr=='L') {
			temp=gridX[1]; gridX[1]=gridY[3];
			temp2=gridY[1]; gridY[1]=temp;
			temp=gridX[3]; gridX[3]=temp2;
			gridY[3]=temp;
		}
		
		else if(odr=='R') {
			temp=gridX[3]; gridX[3]=gridY[3];
			temp2=gridY[1]; gridY[1]=temp;
			temp=gridX[1]; gridX[1]=temp2;
			gridY[3]=temp;
		}
	}
	
	boolean adjustBehind(int a) {
		move=0;
		
		if(SurfaceNum[gridX[1]-1]==a)move=1;
		else if(SurfaceNum[gridY[1]-1]==a)move=2;
		else if(SurfaceNum[gridX[3]-1]==a)move=3;
		else if(SurfaceNum[gridY[3]-1]==a)move=0;
		else move=-1;
		
		if(move>=0) {
			for(i=0;i<move;i++) rotateDice('R');
			return true;
		}
		else return false;
	}
	
	void findRight(int top,int bhd) {
		
		findTop(top);
		/*for(i=0;i<4;i++) System.out.print(SurfaceNum[gridX[i]-1]+" ");
		System.out.println();
		for(i=0;i<4;i++) System.out.print(SurfaceNum[gridY[i]-1]+" ");
		System.out.println();*/
		
		if(SurfaceNum[gridX[1]-1]==bhd)System.out.println(SurfaceNum[gridY[1]-1]);
		else if(SurfaceNum[gridX[3]-1]==bhd)System.out.println(SurfaceNum[gridY[3]-1]);
		else if(SurfaceNum[gridY[1]-1]==bhd)System.out.println(SurfaceNum[gridX[3]-1]);
		else if(SurfaceNum[gridY[3]-1]==bhd)System.out.println(SurfaceNum[gridX[1]-1]);
		else System.out.println("ERROR");
	}
	
	boolean findTop(int top) {
		move=0;
		
		if(top!=SurfaceNum[gridX[0]-1]) {
			for(i=1;i<4;i++) {
				if(SurfaceNum[gridX[i]-1]==top)move=i;
			}
			
			if(move!=0) {
				for(i=0;i<move;i++) rotateDice('W');
			}
			else {
				if(SurfaceNum[gridY[1]-1]==top) rotateDice('S');
				else if(SurfaceNum[gridY[3]-1]==top)rotateDice('N');
				else return false;
			}
		}
		else if(top==SurfaceNum[gridX[0]-1]) return true;
		
		return true;
	}
	

}
