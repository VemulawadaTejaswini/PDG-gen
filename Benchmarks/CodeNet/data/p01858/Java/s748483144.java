// AOJ Sendame リファ
// internship 石田　竜介

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//２人の行動回数を整数入力
		int countAction = sc.nextInt();
		
		String[] aryIsonokun = new String[countAction];
		String[] aryNakajimakun = new String[countAction];
		
		for( int i = 0 ; i < aryIsonokun.length ; i++ ){
			// tameru mamoru kougekida の３種類の文字列が入力される
			aryIsonokun[i] = sc.next();
		}
		
		for( int i = 0 ; i < aryNakajimakun.length ; i++ ){
			// tameru mamoru kougekida の３種類の文字列が入力される
			aryNakajimakun[i] = sc.next();
		}
		
		//Sendameのインスタンス化
		Sendame insSendame = new Sendame( aryIsonokun , aryNakajimakun );
		
		System.out.println(insSendame.runOperation());
		
	}
}

/**
 * Sendameクラス
 * @author User
 *
 */
class Sendame{
	
	private String[] aryPlayer1;
	private String[] aryPlayer2;
	
	private String playerName1 = "Isono-kun";
	private int powerPlayer1 = 0;
	
	private String playerName2 = "Nakajima-kun";
	private int powerPlayer2 = 0;
	
	private String draw = "Hikiwake-kun";
	
	/**
	* コンストラクタ
	* @param aryPlayer1 tameru mamoru kougekida のいずれかが入った配列
	* @param aryPlayer2 tameru mamoru kougekida のいずれかが入った配列
	*/
	public Sendame(String[] aryPlayer1 , String[] aryPlayer2){
		
		this.aryPlayer1 = aryPlayer1;
		this.aryPlayer2 = aryPlayer2;
		
	}
	
	public String runOperation(){
	
		for( int i = 0 ; i < aryPlayer1.length ; i++ ){
			
			if( judgeBattle( aryPlayer1[i],aryPlayer2[i])){
			
				return playerName1;
				
			}
			
			if( judgeBattle( aryPlayer2[i],aryPlayer1[i])){
			
				return playerName2;
				
			}
			
			if ( aryPlayer1[i] == "tameru" ) { powerPlayer1++; }
			
			if ( aryPlayer1[i] == "kougekida" ) { powerPlayer1 = 0; }
			
			if ( aryPlayer2[i] == "tameru" ) { powerPlayer2++; }
			
			if ( aryPlayer1[i] == "kougekida" ) { powerPlayer2 = 0; }
			
		}
		
		return draw;
		
	}
	
	/**
	* 2人のプレイヤーの勝敗判定
	* @param actionPlayer1 player1のアクション
	* @param actionPlayer2 player2のアクション
	*/
	public boolean judgeBattle( String actionPlayer1 , String actionPlayer2 ){
		
		//player1が攻撃ではなかったら
		if ( !actionPlayer1.equals("kougekida") ) {
			
			//player2が攻撃でパワーが０だったらplayer1が勝利
			if ( actionPlayer2.equals("kougekida") && powerPlayer2 == 0 ) {
				return true;
			}
			
		//player1が攻撃だったら
		} else if ( actionPlayer1.equals("kougekida") ) {
			
			
			if ( actionPlayer2.equals("kougekida") ) {
				
				if ( powerPlayer1 > powerPlayer2 ){
					
					return true;
					
				}
				
			} else if ( actionPlayer2.equals("mamoru") ) {
				
				if ( powerPlayer1 >= 5 ) {
					
					return true;
					
				}
				
			} else if ( actionPlayer2.equals("tameru") ) {
				
				if ( powerPlayer1 >= 1 ) {
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
	
	}
}