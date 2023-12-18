//AOJ Misterious Gems
//internship 石田　竜介

import java.util.ArrayList;
import java.util.Scanner;

class Main {

	/**
	* プログラムエントリ
	* @param args
	*/
	public static void main ( String[] args ) {
	
	
		Scanner sc = new Scanner ( System.in );
		
		ArrayList<String> listAnswer = new ArrayList<String>();
		
		//固定値　X軸長さ
		int lengthAreaX = 21;
		//固定値　Y軸長さ
		int lengthAreaY = 21;
		
		while ( true ) {
			
			//宝石の個数
			int countGem = sc.nextInt();
			
			//終了条件
			if( countGem == 0 ) break;
			
			//探索場所
			int[][] arySearchArea = new int[lengthAreaX][lengthAreaY];
			
			//ロボットが最初に降下する場所　ロボットを2とする
			arySearchArea[10][10] = 2;
			
			for ( int i = 0 ; i < countGem ; i++ ) {
				//宝石のある場所　x軸方向
				int directionX = sc.nextInt();
				//宝石のある場所　y軸方向
				int directionY = sc.nextInt();
				
				arySearchArea[directionX][directionY] = 1;
				
			}
			
			int countOperation = sc.nextInt();
			
			char[] aryOperationDirection = new char[countOperation];
			int[] aryOperationDistance = new int[countOperation];
			
			for ( int i = 0 ; i < countOperation ; i++ ) {
				
				//方向
				aryOperationDirection[i] = sc.next().charAt(0);
				//進む距離
				aryOperationDistance[i] = sc.nextInt();
	
			}
			
			//MisteriousGemsインスタンス化
			MisteriousGems insMG = new MisteriousGems( arySearchArea , aryOperationDirection , aryOperationDistance );
			//答えをリストに格納
			listAnswer.add( insMG.getAnswer() );
			
		}
		
		//最後にlistAnswerに格納された情報をすべて出力
		for ( int i = 0 ; i < listAnswer.size(); i++ ) {
			System.out.println( listAnswer.get(i) );
		}
	}
}

/**
 * MisteriousGemクラス
 * @author SS-Internship01
 *
 */
class MisteriousGems {
	
	private int[][] arySearchArea;
	private char[] aryOperationDirection;
	private int[] aryOperationDistance;
	private String answer = "Yes";
	//private int directionX = 10;
	//private int directionY = 10;
	
	/**
	* コンストラクタ
	* @param arySearchArea 探索場所　２次元配列
	* @param aryOperation 命令　２次元配列
	*/
	public MisteriousGems ( int[][] arySearchArea , char[] aryOperationDirection , int[] aryOperationDistance ) {
		
		this.arySearchArea = arySearchArea;
		this.aryOperationDirection = aryOperationDirection;
		this.aryOperationDistance = aryOperationDistance;
		
		for ( int i = 0 ; i < aryOperationDirection.length ; i++ ) {
			
			deleteGem( aryOperationDirection[i] , aryOperationDistance[i] );
			
		}
		
		for ( int i = 0 ; i < arySearchArea.length ; i++ ) {
			for ( int j = 0 ; j < arySearchArea[i].length ; j++ ) {
				
				if ( arySearchArea[i][j] == 1 ) {
					
					answer = "No";
					
				}
				
			}
		}
	}
	/**
	* ロボットが通った座標を0に置き換える
	* @param direction
	* @param distance
	*/
	public void deleteGem ( char direction , int distance ) {
		
		char[] fixingDirection = { 'N' , 'W' , 'S' , 'E' };
		int [][] move = { {0,1} , {-1,0} , {0,-1} , {1,0} };
		
		for ( int x = 0 ; x < fixingDirection.length ; x++ ) {
			
			if ( direction == fixingDirection[x] ){
				
				for ( int i = 0 ; i < arySearchArea.length ; i++ ) {
					for ( int j = 0 ; j < arySearchArea[i].length ; j++ ) {
						
						if ( arySearchArea[i][j] == 2 ) {
							
							int directionX = i;
							int directionY = j;
							
							for ( int k = 1 ; k <= distance ; k++ ) {
								
								arySearchArea[directionX][directionY] = 0;
								
								directionX += move[x][0];
								directionY += move[x][1];
								
							}
							
							if ( direction == 'E' ) {
								
								arySearchArea[directionX][directionY] = 3;
								break;
								
							} else {
								
								arySearchArea[directionX][directionY] = 2;
								break;
								
							}
							
						}
						
					}
				}
				
				//E救済用
				for ( int i = 0 ; i < arySearchArea.length ; i++ ) {
					for ( int j = 0 ; j < arySearchArea[i].length ; j++ ) {
						
						if ( arySearchArea[i][j] == 3 ) arySearchArea[i][j] = 2;
							
					}
				}
			}	
		}
	}
	
	/*
	public void deleteGem( char direction , int distance ){
		
		for( int i = 0 ; i < arySearchArea.length ; i++ ){
			for( int j = 0 ; j < arySearchArea[i].length ; j++ ){
				
				//ロボットの場所を見つけ
				if( arySearchArea[i][j] == 2 ){
					
					// Nだった場合
					if( direction == 'N'){
						
						for( int k = 1 ; k <= distance ; k++ ){
							
							arySearchArea[i][j] = 0;
							arySearchArea[i][j+k] = 0;
							
						}
						
						arySearchArea[i][j + distance] = 2;
						break;
						
					// Wだった場合
					}else if( direction == 'W'){
						
						for( int k = 1 ; k <= distance ; k++ ){
							
							arySearchArea[i][j] = 0;
							arySearchArea[i-k][j] = 0;
						}
						
						arySearchArea[i - distance][j] = 2;
						break;
						
					// Sだった場合
					}else if( direction == 'S'){
						
						for( int k = 1 ; k <= distance ; k++ ){
							
							arySearchArea[i][j] = 0;
							arySearchArea[i][j-k] = 0;
						}
						
						arySearchArea[i][j - distance] = 2;
						break;
						
						
					// Eだった場合
					}else if( direction == 'E'){
						
						for( int k = 1 ; k <= distance ; k++ ){
							
							arySearchArea[i][j] = 0;
							arySearchArea[i+k][j] = 0;
						}
						
						arySearchArea[i + distance][j] = 3;
						break;
						
					}
					
				}
			}
		}
		
		//E救済用
		for( int i = 0 ; i < arySearchArea.length ; i++ ){
			for( int j = 0 ; j < arySearchArea[i].length ; j++ ){
				
				if( arySearchArea[i][j] == 3 ){
					arySearchArea[i][j] = 2;
				}
				
			}
		}
		
	}
	
	*/
	public String getAnswer(){
		return answer;
	}
}