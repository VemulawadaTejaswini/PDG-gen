import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String args[] ) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        String[] NUMBER = br.readLine().split(" ");
        DICE dice = new DICE(NUMBER);
        String[] ORDER = br.readLine().split("");

        for(int i = 0;i < ORDER.length ; i++){
    	   Roll_Dice.Roll(ORDER[i] , dice);
        }


        System.out.println( dice.surface[0] );

    }



}


class DICE{

	int[] surface = new int[6];

    DICE(String[] number){                              //0: ?????¢
                                                        //1: ??£??¢
    	for(int i = 0; i < 6;i++ ){                    //2: ?????¢
    		surface[i] = Integer.parseInt(number[i]);  //3: ?????¢
    	}                                               //4: ?????¢
                                                        //5: ?????¢
    }




}


class Roll_Dice{


	static void Roll(String order , DICE dice){



		if( order.equals("S") ){
            int tmp0 = dice.surface[0], tmp1 = dice.surface[1], tmp4 = dice.surface[4], tmp5 = dice.surface[5];
            dice.surface[0] = tmp4;
            dice.surface[1] = tmp0;
            dice.surface[4] = tmp5;
            dice.surface[5] = tmp1;
		}
		else if( order.equals("N") ){
			int tmp0 = dice.surface[0], tmp1 = dice.surface[1], tmp4 = dice.surface[4], tmp5 = dice.surface[5];
            dice.surface[0] = tmp1;
            dice.surface[1] = tmp5;
            dice.surface[4] = tmp0;
            dice.surface[5] = tmp4;

		}
		else if( order.equals("W") ){
			int tmp0 = dice.surface[0], tmp2 = dice.surface[2], tmp3 = dice.surface[3], tmp5 = dice.surface[5];
            dice.surface[0] = tmp2;
            dice.surface[2] = tmp5;
            dice.surface[3] = tmp0;
            dice.surface[5] = tmp3;

		}
		else if( order.equals("E") ){
			int tmp0 = dice.surface[0], tmp2 = dice.surface[2], tmp3 = dice.surface[3], tmp5 = dice.surface[5];
            dice.surface[0] = tmp3;
            dice.surface[2] = tmp0;
            dice.surface[3] = tmp5;
            dice.surface[5] = tmp2;

		}

	}




   void swap_surface(int x , int y){
	   int tmp = x;
	   x = y;
	   y = tmp;

   }


}