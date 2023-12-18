//AOJ A:Sendame　リファクタリング
//internship 石田竜介

import java.util.Scanner;


class Main {
	/**
	 * プログラムエントリポイント
	 * @param args
	 */
	public static void main (String[] args ) {
		
		String player1 = "Isono-kun";
		String player2 = "Nakajima-kun";
		String winner = "Hikiwake-kun";
		
		Scanner sc = new Scanner(System.in);
		
		//行動する回数入力
		int countAction = sc.nextInt();
		
		//プレイヤーごとに行動回数の長さの配列生成
		String[] aryActionIsono = new String[countAction];
		String[] aryActionNakajima = new String[countAction];
		
		//配列に行動を入力( kougekida mamoru tameru の三種類 )
		for ( int i = 0 ; i < countAction ; i++ ) {
			
			aryActionIsono[i] = sc.next();
			
		}
		
		//配列に行動を入力( kougekida mamoru tameru の三種類 )
		for ( int i = 0 ; i < countAction ; i++ ) {
			
			aryActionNakajima[i] = sc.next();
			
		}
		
		//playerごとにPlayerクラスのインスタンス化
		Player insIsono = new Player(aryActionIsono);
		Player insNakajima = new Player(aryActionNakajima);
		
		//各playerの行動回数分判定を行う
		for ( int i = 0 ; i < countAction ; i++ ) {
			
			//player1が勝利したら
			if ( judgeP1Win( insIsono , insNakajima , i ) ) {
				
				winner = player1;
				break;
			
			}
			
			//player2が勝利したら
			if ( judgeP1Win( insNakajima , insIsono , i ) ) {
				
				winner = player2;
				break;
				
			}
			
			//勝負がつかなかったら
			if ( insIsono.getAction(i).equals("tameru") ) { insIsono.setPowerAdd();}
			
			if ( insIsono.getAction(i).equals("kougekida") ) { insIsono.setPower0(); }
				
			if ( insNakajima.getAction(i).equals("tameru") ) { insNakajima.setPowerAdd(); }
			
			if ( insNakajima.getAction(i).equals("kougekida") ) { insNakajima.setPower0(); }
			
		}
		
		System.out.println(winner);
		
	}
	
	/**
	 * player1が勝利条件をみたしているか判定する
	 * @param player1 player1のインスタンス
	 * @param player2 player2のインスタンス
	 * @param i 行動回数　何番目
	 * @return
	 */
	private static boolean judgeP1Win ( Player player1 , Player player2 , int i ) {
		
		//player1が攻撃ではなかったら
		if ( !player1.aryPlayerAction[i].equals("kougekida") ) {
			
			//player2が攻撃でパワーが０だったらplayer1が勝利
			if ( player2.aryPlayerAction[i].equals("kougekida") && player2.getPower() == 0 ) {
				return true;
			}
			
		//player1が攻撃だったら
		} else if ( player1.aryPlayerAction[i].equals("kougekida") ) {
			
			
			if ( player2.aryPlayerAction[i].equals("kougekida") ) {
				
				if ( player1.getPower() > player2.getPower() ){
					
					return true;
					
				}
				
			} else if ( player2.aryPlayerAction[i].equals("mamoru") ) {
				
				if ( player1.getPower() >= 5 ) {
					
					return true;
					
				}
				
			} else if ( player2.aryPlayerAction[i].equals("tameru") ) {
				
				if ( player1.getPower() >= 1 ) {
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
	
	}
}
/** 
 * Playreクラス
 * プレイヤーの情報保持
 * @author SS-Internship01
 */
class Player {
	
	/**
	 * playerの攻撃力
	 */
	public int playerPower = 0;
	/**
	 * playerの行動が格納された配列
	 */
	public String[] aryPlayerAction;
	
	/**
	 * コンストラクタ
	 * @param aryPlayerAction
	 */
	public Player( String[] aryPlayerAction ) {
		
		this.aryPlayerAction = aryPlayerAction.clone();
		
	}
	
	public String getAction( int i ){
		
		return aryPlayerAction[i];
		
	}
	
	/**
	 * playerPowerを返すメソッド
	 * @return
	 */
	public int getPower(){
		
		return playerPower;
		
	}
	
	/**
	 * playerPowerを加算するメソッド
	 * ただし、5未満の場合
	 */
	public void setPowerAdd(){
		
		if( playerPower < 5 ) {
			
			playerPower++;
			
		}
		
	}
	
	/**
	 * 攻撃後パワーを0に戻す
	 */
	public void setPower0() {
		
		playerPower = 0;
		
	}
	
}