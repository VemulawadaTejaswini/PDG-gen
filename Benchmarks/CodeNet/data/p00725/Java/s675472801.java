import java.util.*;

class Main{
    static int min;//Ú®ñÌÅ¬l
    static int goalX,goalY;//S[ÌÀW
    static int w,h;//A³

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	w = sc.nextInt();
	h = sc.nextInt();

	while(w!=0 && h!=0){

	    min = 11;
	    int[][] field = new int[h][w];//ÕÊ
	    int startX = 0;//X^[gn_ÌxÀW
	    int startY = 0;//X^[gn_ÌyÀW
	    for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
		    field[i][j] = sc.nextInt();
		    if(field[i][j]==2){startX = j; startY = i; field[i][j]=0;}//X^[g
		    if(field[i][j]==3){goalX = j; goalY = i;}//S[
		}
	    }
	    solve(0,startX,startY,field);

	    if(min==11)min=-1;//S[ÉHè¯È©Á½
	    System.out.println(min);

	    w = sc.nextInt();
	    h = sc.nextInt();
	}
    }

    public static void solve(int count, int posX, int posY, int[][] field){
	if(posX==goalX && posY==goalY){//S[ÌÀWÆêvµ½ç
	    if(count<min)min = count;//Å¬lXV
	    return;
	}
	
	int[][] field1 = new int[h][w];
	int[][] field2 = new int[h][w];
	int[][] field3 = new int[h][w];
	int[][] field4 = new int[h][w];
	for(int i=0; i<h; i++){
	    for(int j=0; j<w; j++){
		field1[i][j] = field[i][j];
		field2[i][j] = field[i][j];
		field3[i][j] = field[i][j];
		field4[i][j] = field[i][j];
	    }
	}
	int pos1 = go(1,posX,posY,field1);
	if(pos1!=-1){//ãûü
	    if(pos1-1>=0 && field1[pos1-1][posX]==1)field1[pos1-1][posX]=0;//áQ¨ðÁ·
	    if(count+1>10){return;}//Ú®ñI[o[
	    solve(count+1,posX,pos1,field1);
	}
	int pos2 = go(2,posX,posY,field2);
	if(pos2!=-1){//ºûü
	    if(pos2+1<h-1 && field2[pos2+1][posX]==1)field2[pos2+1][posX]=0;
	    if(count+1>10){return;}
	    solve(count+1,posX,pos2,field2);
	}
	int pos3 = go(3,posX,posY,field3);
	if(pos3!=-1){//Eûü
	    if(pos3+1<w-1 && field3[posY][pos3+1]==1)field3[posY][pos3+1]=0;
	    if(count+1>10){return;}
	    solve(count+1,pos3,posY,field3);
	}
	int pos4 = go(4,posX,posY,field4);
	if(pos4!=-1){//¶ûü
	    if(pos4-1>=0 && field4[posY][pos4-1]==1)field4[posY][pos4-1]=0;
	    if(count+1>10){return;}
	    solve(count+1,pos4,posY,field4);
	}
    }

    //êèÌûüÉißé¾¯iÞ
    public static int go(int houko,int posX,int posY,int[][] field){
	if(posX<0 || posY<0)return -1;
	if(houko==1){//ãûü
	    if(posY-1>=0 && field[posY-1][posX]==1)return -1;//áQ¨ª ÁÄißÈ¢
	    for(;;){
		if(posY-1<0)return -1;//[©ç¿½
		if(field[posY-1][posX]==3){return posY-1;}//S[Èç
		if(field[posY-1][posX]==1){return posY;}//áQ¨ÉÔÂ©Á½ç
		posY--;//iÞ
	    }
	}
	if(houko==2){//ºûü
	    if(posY+1<=h-1 && field[posY+1][posX]==1)return -1;
	    for(;;){
		if(posY+1>h-1)return -1;
		if(field[posY+1][posX]==3){return posY+1;}
		if(field[posY+1][posX]==1){return posY;}
		posY++;
	    }
	}
	if(houko==3){//Eûü
	    if(posX+1<=w-1 && field[posY][posX+1]==1)return -1;
	    for(;;){
		if(posX+1>w-1)return -1;
		if(field[posY][posX+1]==3){return posX+1;}
		if(field[posY][posX+1]==1){return posX;}
		posX++;
	    }
	}
	if(houko==4){//¶ûü
	    if(posX-1>=0 && field[posY][posX-1]==1)return -1;
	    for(;;){
		if(posX-1<0)return -1;
		if(field[posY][posX-1]==3){return posX-1;}
		if(field[posY][posX-1]==1){return posX;}
		posX--;
	    }
	}
	return -1;
    }
}