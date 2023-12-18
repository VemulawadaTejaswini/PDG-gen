import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	String strnum1 = sc.nextLine();//サイコロの目 1回目
    	String strnum2 = sc.nextLine();//サイコロの目 2回目
        	
        Dice dice = new Dice( strnum1 , strnum2 );
        
        int hantei1 =dice.judge1();
        int hantei2 =dice.judge2();
        
        if( hantei1 == hantei2 ){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
        
    }
}

//-----------------------------------------------------------------

class Dice{
	
	int[] dice1 = new int[6];
	int[] dice2 = new int[6];
	String[] me1 ;
	String[] me2 ;
	int ue = 1;
	int mae = 2;
	int kari = 0;
	
	//mainクラスで入力されたものを格納
	public Dice( String strnum1 , String strnum2 ){
				
		me1 = strnum1.split(" ");
		
		for(int i = 0 ; i < me1.length ; i++ ){
			dice1[i] = Integer.parseInt(me1[i]);
		}
		
		me2 = strnum1.split(" ");
		
		for(int i = 0 ; i < me2.length ; i++ ){
			dice2[i] = Integer.parseInt(me2[i]);
		}
	}
	
	
	public int judge1(){
		for( int i = 0 ; i < 4 ; i++ ){
			if( dice1[0] == ue ){
				break;
			}
			N1();
		}
		
		for( int i = 0 ; i < 4 ; i++ ){
			if( dice1[0] == ue ){
				break;
			}
			E1();
		}
		
		for( int i = 0 ; i < 4 ; i++ ){
			if( dice1[1] == mae ){
				break;
			}
			N1();
			E1();
			S1();
		}
		
		return dice1[2];
	}
	
	public int judge2(){
		for( int i = 0 ; i < 4 ; i++ ){
			if( dice2[0] == ue ){
				break;
			}
			N2();
		}
		
		for( int i = 0 ; i < 4 ; i++ ){
			if( dice2[0] == ue ){
				break;
			}
			E2();
		}
		
		for( int i = 0 ; i < 4 ; i++ ){
			if( dice2[1] == mae ){
				break;
			}
			N2();
			E2();
			S2();
		}
		
		return dice2[2];
	}
	
	
	public void E1(){
		kari = dice1[0];
        dice1[0] = dice1[3] ;
        dice1[3] = dice1[5] ;
        dice1[5] = dice1[2];
        dice1[2] = kari;
        //return dice[0];
	}
	
	public void N1(){
		kari = dice1[0];
        dice1[0] = dice1[1] ;
        dice1[1] = dice1[5] ;
        dice1[5] = dice1[4];
        dice1[4] = kari;
        //return dice[0];
	}
	public void S1(){
		kari = dice1[0];
	    dice1[0] = dice1[4] ;
	    dice1[4] = dice1[5] ;
	    dice1[5] = dice1[1];
	    dice1[1] = kari;
	    //return dice[0];
	}
	public void W1(){
		kari = dice1[0];
	    dice1[0] = dice1[2] ;
	    dice1[2] = dice1[5] ;
	    dice1[5] = dice1[3];
	    dice1[3] = kari;
	    //return dice[0];
	}
	
	public void E2(){
		kari = dice1[0];
        dice1[0] = dice1[3] ;
        dice1[3] = dice1[5] ;
        dice1[5] = dice1[2];
        dice1[2] = kari;
        //return dice[0];
	}
	
	public void N2(){
		kari = dice2[0];
        dice2[0] = dice2[1] ;
        dice2[1] = dice2[5] ;
        dice2[5] = dice2[4];
        dice2[4] = kari;
        //return dice[0];
	}
	public void S2(){
		kari = dice2[0];
	    dice2[0] = dice2[4] ;
	    dice2[4] = dice2[5] ;
	    dice2[5] = dice2[1];
	    dice2[1] = kari;
	    //return dice[0];
	}
	public void W2(){
		kari = dice2[0];
	    dice2[0] = dice2[2] ;
	    dice2[2] = dice2[5] ;
	    dice2[5] = dice2[3];
	    dice2[3] = kari;
	    //return dice[0];
	}
	
}