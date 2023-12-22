import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[][] card = new int[4][13];
		String[] card_symbol = { "S" , "H" , "C" , "D" };
		String in_symbol="";
		int in_num=0;

    	//初期化
    	for( int i = 0 ; i < card.length ; i++ ) {
    		for ( int j = 0 ; j < card[i].length ; j++ ) {
    			card[i][j] = 0;
    		}

    	}

    	Scanner sc= new Scanner( System.in );
    	int card_num = 0;
    	card_num = sc.nextInt();


    	for ( int i = 0 ; i < card_num ; i++ ) {
    		in_symbol = sc.next();
    		in_num = sc.nextInt();

        	switch( in_symbol ) {
        		case "S":
        			card[0][in_num-1] = 1;
        			break;
        		case "H":
        			card[1][in_num-1] = 1;
        			break;
        		case "C":
        			card[2][in_num-1] = 1;
        			break;
        		case "D":
        			card[3][in_num-1] = 1;
        			break;
        	}
    	}

    	for( int i = 0 ; i < card.length ; i++ ) {
    		for ( int j = 0 ; j < card[i].length ; j++ ) {
    			if( card[i][j] == 0 ) {
    				System.out.println( card_symbol[i] + " " + ( j + 1 ) );
    			}
    		}
    	}
    	sc.close();
	}
}
