//AOJ Misterious Gems
//internship 石田　竜介

import java.util.ArrayList;
import java.util.Scanner;

class Main{

	/**
	* プログラムエントリ
	* @param args
	*/
	public static void main(String[] args){
	
	
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> listAnswer = new ArrayList<String>();
		
		int lengthAreaX = 21;
		int lengthAreaY = 21;
		
		while(true){
			
			//宝石の個数
			int countGem = sc.nextInt();
			
			//終了条件
			if( countGem == 0 ){
				break;
			}
			
			//探索場所
			int[][] arySearchArea = new int[lengthAreaX][lengthAreaY];
			
			//ロボットを2と仮定
			arySearchArea[10][10] = 2;
			
			for( int i = 0 ; i < countGem ; i++ ){
				//宝石のある場所　x軸方向
				int coordinateX = sc.nextInt();
				//宝石のある場所　y軸方向
				int coordinateY = sc.nextInt();
				
				arySearchArea[coordinateX][coordinateY] = 1;
				
			}
			
			int countOperation = sc.nextInt();
			
			char[] aryOperationDirection = new char[countOperation];
			int[] aryOperationDistance = new int[countOperation];
			
			for( int i = 0 ; i < countOperation ; i++ ){
				
				//方向
				aryOperationDirection[i] = sc.next().charAt(0);
				//進む距離
				aryOperationDistance[i] = sc.nextInt();
	
			}
			
			MisteriousGems insMG = new MisteriousGems( arySearchArea , aryOperationDirection , aryOperationDistance );
			
			listAnswer.add(insMG.getAnswer());
			
		}
		
		for( int i = 0 ; i < listAnswer.size(); i++ ){
			System.out.println(listAnswer.get(i));
		}
	}
}

/**
 * MisteriousGemクラス
 * @author SS-Internship01
 *
 */
class MisteriousGems{
	
	int[][] arySearchArea;
	char[] aryOperationDirection;
	int[] aryOperationDistance;
	String answer = "Yes";
	
	/**
	* コンストラクタ
	* @param arySearchArea 探索場所　２次元配列
	* @param aryOperation 命令　２次元配列
	*/
	public MisteriousGems(int[][] arySearchArea , char[] aryOperationDirection , int[] aryOperationDistance){
		
		this.arySearchArea = arySearchArea;
		this.aryOperationDirection = aryOperationDirection;
		this.aryOperationDistance = aryOperationDistance;
		
		for( int i = 0 ; i < aryOperationDirection.length ; i++ ){
			
			deleteGem( aryOperationDirection[i] , aryOperationDistance[i] );
			
			
			
			
			
			//テスト
			for( int j = 0 ; j < arySearchArea.length ; j++ ){
				for( int k = 0 ; k < arySearchArea[j].length ; k++ ){
					System.out.print(arySearchArea[j][k]);
				}
				System.out.println();
			}
			System.out.println();
			
			
			
			
			
		}
		
		for( int i = 0 ; i < arySearchArea.length ; i++ ){
			for( int j = 0 ; j < arySearchArea[i].length ; j++ ){
				
				if( arySearchArea[i][j] == 1){
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
	
	public String getAnswer(){
		return answer;
	}
}