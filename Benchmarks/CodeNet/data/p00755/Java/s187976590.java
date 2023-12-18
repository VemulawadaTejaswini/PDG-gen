import java.io.*;
import java.util.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    StringTokenizer st;
    private static boolean end = false;

    public static void main ( String [] args ) throws IOException
    {
	while(!end){
	    new Main().cal();
	}
	
    }

int turn;
int max;
int h;
int w;
int c;

    private void cal() throws IOException 
    {

	int result;

	int[][] panel;
	boolean[][] sameColor;


	st = new StringTokenizer(br.readLine());
	h = Integer.parseInt(st.nextToken());
	w = Integer.parseInt(st.nextToken());
	c = Integer.parseInt(st.nextToken());
	if( h == 0 && w == 0 && c == 0){
		end = true;
		return;	
	}

	panel = new int[h][w];

	for( int i = 0; i < h; i++){
		st = new StringTokenizer(br.readLine());		
		for( int j = 0; j < w; j++){
			panel[i][j] = Integer.parseInt(st.nextToken());
		}
	}	

	sameColor = new boolean[h][w];
	sameColor[0][0] = true;
	result = 1;
	boolean nomore = false;
	while(!nomore){
		int tempNum = result;
		result = changePoint(sameColor, result, panel);
		if(tempNum == result){
			nomore = true;
		}
	}

	turn = 0;
	max = 0;

	nextTurn(result, sameColor, panel);

	System.out.println(max);

    }


    private void nextTurn(int result, boolean[][] sameColor, int[][] panel){
	turn++;
	if( turn == 5 ){
		result = changeColor(c, result, sameColor, panel);
		if( result > max )	max = result;


	}
	else {
	for( int col = 1; col < 7 ;col++){
		boolean[][] tmpsameColor = new boolean[h][w];
		int[][] tmppanel = new int[h][w];
		for(int l=0; l < h; l++){
		for(int k=0; k < w; k++){
			tmpsameColor[l][k] = sameColor[l][k];
			tmppanel[l][k] = panel[l][k];
		}
		}
		if( col == panel[0][0] ) continue;
		int tmpresult = changeColor(col, result, sameColor, panel);
		nextTurn(tmpresult, sameColor, panel);
		for(int l=0; l < h; l++){
		for(int k=0; k < w; k++){
			sameColor[l][k] = tmpsameColor[l][k];
			panel[l][k] = tmppanel[l][k];
		}
		}
	
	}
	}
	turn--;
    }


    private int changeColor(int col, int result, boolean[][] sameColor, int[][] panel){
	for(int l=0; l< h; l++){
	for(int k=0; k< w; k++){
		if( sameColor[l][k] )	panel[l][k] = col;
	}
	}

	boolean nomore = false;
	while(!nomore){
		int tempNum = result;
		result = changePoint(sameColor, result, panel);
		if(tempNum == result){
			nomore = true;
		}
	}
	return result;
    }

   private int changePoint(boolean[][] sameColor,int result , int[][] panel){
	for(int i=0; i < h; i++){
	for(int j=0; j < w; j++){
	if(sameColor[i][j])	continue;
	else if( i+1 < h && panel[i][j] == panel[i+1][j] && sameColor[i+1][j] ){
			sameColor[i][j] = true;
			result++;
	}
	else if( i-1 >= 0 && panel[i][j] == panel[i-1][j] && sameColor[i-1][j] ){
			sameColor[i][j] = true;
			result++;
	}
	else if( j+1 < w && panel[i][j] == panel[i][j+1] && sameColor[i][j+1] ){
			sameColor[i][j] = true;
			result++;
	}
	else if( j-1 >= 0 && panel[i][j] == panel[i][j-1] && sameColor[i][j-1] ){
			sameColor[i][j] = true;
			result++;
	}
	}
	}
	return result;
   }


   private void printPanel(int[][] panel, boolean[][] sameColor){
	for(int i =0; i< h; i++){
	for(int j =0; j< w; j++){
		System.out.print(panel[i][j]+" ");
	}
	System.out.println();
	}
	for(int i =0; i< h; i++){
	for(int j =0; j< w; j++){
	if(sameColor[i][j])
		System.out.print("1 ");
	else	System.out.print("0 ");
	}
	System.out.println();
	}
  }
}