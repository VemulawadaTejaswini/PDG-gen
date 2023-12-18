import java.util.Scanner;

public class Main {

    private static int board[][] = new int[8][8];

    private static int[][][] mino  = {{{0, 1},{1, 0},{1, 1}},
                                      {{1, 0},{2, 0},{3, 0}},
    	                              {{0, 1},{0, 2},{0, 3}},
    	                              {{1, 0},{1,-1},{2,-1}},
    	                              {{0, 1},{1, 1},{1, 2}},
    	                              {{1, 0},{1, 1},{2, 1}},
    	                              {{0, 1},{1, 0},{1,-1}}};

public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);

        char[] c;
        char ret;
        while(sc.hasNext()){
            for(int i=0;i<8;i++){
                c = sc.next().toCharArray();
                for(int j=0;j<8;j++){
                    board[i][j] = Character.digit(c[j],10);
                }
            }

            ret = 'N';
            loop:for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(board[i][j] == 1){
                    	for(int k=0;k<7;k++){
                            if((ret = check(i,j,k)) != 'N'){
                            	break loop;
                            }
                    	}
                    }
                }
            }
            System.out.println(ret);
        }
    }

    private static char check(int i,int j,int kind){

        char ret = 'N';

        int i_2 = i + mino[kind][0][0],
            j_2 = j + mino[kind][0][1],
            i_3 = i + mino[kind][1][0],
            j_3 = j + mino[kind][1][1],
            i_4 = i + mino[kind][2][0],
            j_4 = j + mino[kind][2][1];

        if ( 0 <= i_2 && i_2 < 8 &&
             0 <= j_2 && j_2 < 8 &&
             0 <= i_3 && i_3 < 8 &&
             0 <= j_3 && j_3 < 8 &&
             0 <= i_4 && i_4 < 8 &&
             0 <= j_4 && j_4 < 8    ) {

            if(board[i_2][j_2] == 1 &&
        	   board[i_3][j_3] == 1 &&
          	   board[i_4][j_4] == 1) {
                ret = chg(kind);
            }
        }
        return ret;
    }

    private static char chg(int i){

    	char ret = 'N';

    	switch(i){
    		case 0: { ret = 'A'; break;}
    		case 1: { ret = 'B'; break;}
    		case 2: { ret = 'C'; break;}
    		case 3: { ret = 'D'; break;}
    		case 4: { ret = 'E'; break;}
    		case 5: { ret = 'F'; break;}
    		case 6: { ret = 'G';       }
    	}
    	return ret;
    }
}