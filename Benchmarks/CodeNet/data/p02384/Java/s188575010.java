
import java.util.*;

class Main {
	 
	public static void main(String[] args) {
		
		Scanner cin=new Scanner(System.in);
		
		Dice dice=new Dice();
		
		for(int i=0;i<6;i++) {
			dice.SurfaceNum[i]=cin.nextInt();
		}
		
		int q=cin.nextInt();
		
		for(int i=0;i<q;i++) {
			dice.findRight(cin.nextInt(), cin.nextInt());
		}
	}
	

}


class Dice {
	int SurfaceNum[]=new int[6];
	
	int gridX[]= {1,3,6,4},gridY[]= {1,5,6,2};
	
	int temp=1,i=0,move=0;
	
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
	}
	
	void findRight(int top,int bhd) {
		
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
				else rotateDice('N');
			}
		}
		
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
	

}
