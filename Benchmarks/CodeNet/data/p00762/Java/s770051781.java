import java.util.*;
 
class Main {
	
    public static void main(String[] args) {
         
        Scanner cin=new Scanner(System.in);
        while(true) {
        	
        	int n=cin.nextInt(),dicemap[][]=new int[50][50];
            
        	if(n==0)break;
            
            Dice dices[]=new Dice[n];
            
            for(int i=0;i<n;i++) {
            	//System.out.println(i);
            	dices[i]=new Dice();
            	int t=cin.nextInt(),f=cin.nextInt();
            	
            	dices[i].findTop(t); dices[i].adjustBehind(f);
            	
            	
            	
            	int h,x=25,y=25,max=0,d=-1;
        		int mx[]= {0,1,0,-1}, my[]= {1,0,-1,0};
        		char rd[]= {'N','E','S','W'};
        		
        		if(dicemap[25][25]==0) {
        			dices[i].h=1;
        			dicemap[25][25]=i+1;
        			continue;
        		}
        		else {
        			h=dices[dicemap[25][25]-1].h+1;
        			
        			while(h>1) {
            			max=0;d=-1;
            			for(int j=0;j<4;j++) {
            				
            				if(dices[i].SurfaceNum[dices[i].gridZ[j]-1]>=4 && Math.max(dices[i].SurfaceNum[dices[i].gridZ[j]-1], max) >max) {
            					if(dicemap[y+my[j]][x+mx[j]]==0) {
            						max=dices[i].SurfaceNum[dices[i].gridZ[j]-1];
            						d=j;
            					}
            					else if(h-dices[dicemap[y+my[j]][x+mx[j]]-1].h >=2) {
            						max=dices[i].SurfaceNum[dices[i].gridZ[j]-1];
            						d=j;
            					}
            				}
            				
            			}
            			
            			if(d>-1) {
            				dices[i].rotateDice(rd[d]);
            				//System.out.println("h="+h+" "+"ROTATE"+" "+rd[d]);
            				x+=mx[d]; y+=my[d];
            				
            				if(dicemap[y][x]==0)h=1;
            				else h=dices[dicemap[y][x]-1].h+1;
            			}
            			else break;
            			
            		}
        			
        			dices[i].h=h;
        			if(dicemap[y][x]!=0) {
        				dices[dicemap[y][x]-1].laped=true;
        			}
        			dicemap[y][x]=i+1; 
        			
        			//System.out.println("h="+h+" "+dices[i].SurfaceNum[dices[i].gridX[0]-1]);
        		}
        		
            }
             
            int res[]=new int[6];
            for(int i=0;i<n;i++) {
            	if(!dices[i].laped)res[dices[i].SurfaceNum[dices[i].gridX[0]-1]-1]++;
            }
            
            /*for(int i=20;i<40;i++) {
            	for(int j=20;j<40;j++) {
            		if(dicemap[i][j]!=0)System.out.print(dices[dicemap[i][j]-1].SurfaceNum[dices[dicemap[i][j]-1].gridX[0]-1]+" ");
            		else System.out.print(0+" ");
            	}
            	System.out.println();
            }*/
            
            System.out.printf("%d %d %d %d %d %d\n",res[0],res[1],res[2],res[3],res[4],res[5]);
        }
        
    }
}
 
 
class Dice {
    int SurfaceNum[]=new int[6];
     
    int gridX[]= {1,3,6,4},gridY[]= {1,5,6,2},gridZ[]= {5,3,2,4};
     
    int temp=1,temp2=1,i=0,move=0,h=1;
    boolean laped=false;
    List<Character> rHistory=new ArrayList<>();
    
    Dice() {
    	for(i=0;i<6;i++)SurfaceNum[i]=i+1;
    }
    
    void rotateDice(char odr) {
        if(odr=='N') {
            temp=gridY[3];
            System.arraycopy(gridY, 0, gridY, 1, 3);
            gridY[0]=temp;
            gridX[0]=gridY[0]; gridX[2]=gridY[2];
            gridZ[0]=gridY[1]; gridZ[2]=gridY[3];
        }
        else if(odr=='S') {
            temp=gridY[0];
            System.arraycopy(gridY, 1, gridY, 0, 3);
            gridY[3]=temp;
            gridX[0]=gridY[0]; gridX[2]=gridY[2];
            gridZ[0]=gridY[1]; gridZ[2]=gridY[3];
        }
        else if(odr=='E') {
            temp=gridX[3];
            System.arraycopy(gridX, 0, gridX, 1, 3);
            gridX[0]=temp;
            gridY[0]=gridX[0]; gridY[2]=gridX[2];
            gridZ[1]=gridX[1]; gridZ[3]=gridX[3];
        }
        else if(odr=='W') {
            temp=gridX[0];
            System.arraycopy(gridX, 1, gridX, 0, 3);
            gridX[3]=temp;
            gridY[0]=gridX[0]; gridY[2]=gridX[2];
            gridZ[1]=gridX[1]; gridZ[3]=gridX[3];
        }
         
        else if(odr=='L') {
        	temp=gridZ[0];
            System.arraycopy(gridZ, 1, gridZ, 0, 3);
            gridZ[3]=temp;
            gridX[1]=gridZ[1]; gridX[3]=gridZ[3];
            gridY[1]=gridZ[0]; gridY[3]=gridZ[2];
        }
         
        else if(odr=='R') {
        	temp=gridZ[3];
            System.arraycopy(gridZ, 0, gridZ, 1, 3);
            gridZ[0]=temp;
            gridX[1]=gridZ[1]; gridX[3]=gridZ[3];
            gridY[1]=gridZ[0]; gridY[3]=gridZ[2];
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
