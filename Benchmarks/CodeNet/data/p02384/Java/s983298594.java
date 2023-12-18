import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int Answer = 0;
    	String strnum = sc.nextLine();//サイコロの目
    	int q = sc.nextInt();//質問数
    	
    	for(int i = 0 ; i < q ; i++ ){//qの回数分繰り返す
    		
    		int ue = sc.nextInt();//質問　上
        	int mae = sc.nextInt();//質問　前
        	
        	Dice dice = new Dice( strnum );
        	
        	Answer = dice.judge( ue , mae );
        	
        	System.out.println(Answer);
        	
    	}
    }
}

//-----------------------------------------------------------------

class Dice{
	
	int[] dice = new int[6];
	String[] me ;
	
	int ue = 0;
	int mae = 0;
	int kari = 0;
	int Answer = 0;
	
	//mainクラスで入力されたものを格納
	public Dice( String strnum ){
				
		me = strnum.split(" ");
		
		for(int i = 0 ; i < me.length ; i++ ){
			dice[i] = Integer.parseInt(me[i]);
		}
	}
	
	//dice[0]=ue dice[1]=mae に合わせた時のdice[2]を返す
	public int judge( int ue , int mae){
		
		for( int i = 0 ; i < 4 ; i++ ){
			if( dice[0] == ue ){
				break;
			}
			N();
		}
		
		for( int i = 0 ; i < 4 ; i++ ){
			if( dice[0] == ue ){
				break;
			}
			E();
		}
		
		for( int i = 0 ; i < 4 ; i++ ){
			if( dice[1] == mae ){
				break;
			}
			N();
			E();
			S();
		}
		
		return dice[2];
		
	}
	
	
	public void E(){
		kari = dice[0];
        dice[0] = dice[3] ;
        dice[3] = dice[5] ;
        dice[5] = dice[2];
        dice[2] = kari;
        //return dice[0];
	}
	
	public void N(){
		kari = dice[0];
        dice[0] = dice[1] ;
        dice[1] = dice[5] ;
        dice[5] = dice[4];
        dice[4] = kari;
        //return dice[0];
	}
	public void S(){
		kari = dice[0];
	    dice[0] = dice[4] ;
	    dice[4] = dice[5] ;
	    dice[5] = dice[1];
	    dice[1] = kari;
	    //return dice[0];
	}
	public void W(){
		kari = dice[0];
	    dice[0] = dice[2] ;
	    dice[2] = dice[5] ;
	    dice[5] = dice[3];
	    dice[3] = kari;
	    //return dice[0];
	}
	
}