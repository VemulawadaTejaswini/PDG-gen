
import java.util.*;

class Main {
	 
	public static void main(String[] args) {
		
		Scanner cin=new Scanner(System.in);
		
		Dice dice1=new Dice();
		
		for(int i=0;i<6;i++) {
			dice1.SurfaceNum[i]=cin.nextInt();
		}
		
		Dice dice2=new Dice();
		for(int i=0;i<6;i++) {
			dice2.SurfaceNum[i]=cin.nextInt();
		}
		
		if(!dice2.findTop(dice1.SurfaceNum[dice1.gridX[0]-1])) {
			System.out.println("No");
			return;
		}
		
		if(dice2.adjustBehind(dice1.SurfaceNum[dice1.gridY[3]-1])) {
			boolean j=true;
			
			for(int i=1;i<4;i++) {
				if(dice1.SurfaceNum[dice1.gridX[i]-1]!=dice2.SurfaceNum[dice2.gridX[i]-1]) {
					j=false;
					break;
				}
			}
			
			if(dice1.SurfaceNum[dice1.gridY[1]-1]!=dice2.SurfaceNum[dice2.gridY[1]-1] || dice1.SurfaceNum[dice1.gridY[3]-1]!=dice2.SurfaceNum[dice2.gridY[3]-1])j=false;
			
			if(j)System.out.println("Yes");
			else System.out.println("No");
		}
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
		
		if(gridX[1]==a)move=1;
		else if(gridY[1]==a)move=2;
		else if(gridX[3]==a)move=3;
		else if(gridY[3]==a)move=0;
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
