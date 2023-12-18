import java.util.*;

class Main{
    static int count;//BÂ\È^C
    static int w;//xûüÌ·³
    static int h;//yûüÌ·³

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	w = sc.nextInt();//x
	h = sc.nextInt();//y

	while(w!=0 && h!=0){
	    count = 0;
	    char[][] tile = new char[h][w];//^Cð»ÌÜÜi[
	    int[][] pass = new int[h][w];//Êßµ½ÚóB0(ÊÁÄÈ¢)Æ1(ÊÁ½)ÅL^
	    int posX = 0;//»ÝnÌxÀW
	    int posY = 0;//»ÝnÌyÀW
	    //^Cú»
	    for(int i=0; i<h; i++){
		String line = sc.next();//êsÇÝñÅ©ç
		for(int j=0; j<w; j++){
		    tile[i][j] = line.charAt(j);
		    if(tile[i][j]=='@'){//»ÝÊuðL^
			posX = j;
			posY = i;
		    }
		}
	    }
	    solve(tile,pass,posX,posY);
	    System.out.println(count);
	    
	    w = sc.nextInt();
	    h = sc.nextInt();
	}
    }

    public static void solve(char[][] tile, int[][] pass,int posX, int posY){
	if(pass[posY][posX]==0){//Êßµ½Úó
	    pass[posY][posX] = 1;
	    count++;
	}else return;//ÊßµÄ½çreturn

	if(posY-1>=0 && tile[posY-1][posX]=='.'){//ãûü
	    solve(tile,pass,posX,posY-1);
	}
	if(posX+1<=w-1 && tile[posY][posX+1]=='.'){//Eûü
	    solve(tile,pass,posX+1,posY);
	}
	if(posY+1<=h-1 && tile[posY+1][posX]=='.'){//ºûü
	    solve(tile,pass,posX,posY+1);
	}
	if(posX-1>=0 && tile[posY][posX-1]=='.'){//¶ûü
	    solve(tile,pass,posX-1, posY);
	}

	return;
    }
}