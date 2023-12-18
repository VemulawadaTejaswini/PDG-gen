import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static final int SOURCE = 0;
	private static final int TARGET = 1;
	private static final int PLACE_A = 0;
	private static final int PLACE_B = 1;
	private static final int PLACE_C = 2;
	
	private static boolean[] cupHasBall = {true, false, false};
	private static final int NUM_PLACE = cupHasBall.length;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		while((buf = br.readLine()) != null){
			String[] input = buf.split(",");
			changeCup(input[SOURCE], input[TARGET]);
		}
		printBallPlace();
	}
	public static void printBallPlace(){
		int ballPlace = 0;
		for(int place = 0; place < NUM_PLACE; place++){
			if(cupHasBall[place]){
				ballPlace = place;
				break;
			}
		}
		String mes = "";
		switch(ballPlace){
		case PLACE_A:
			mes = "A";
			break;
		case PLACE_B:
			mes = "B";
			break;
		case PLACE_C:
			mes = "C";
			break;
		default:
			break;
		}
		System.out.println(mes);
	}
	public static void changeCup(String source, String target){
		changeCup(valueOf(source), valueOf(target));
	}
	private static void changeCup(int source, int target){
		boolean hasBall = cupHasBall[source];
		cupHasBall[source] = cupHasBall[target];
		cupHasBall[target] = hasBall;
	}
	private static int valueOf(String place){
		if(place.compareTo("A") == 0)		return 0;
		else if(place.compareTo("B") == 0)	return 1;
		else if(place.compareTo("C") == 0)	return 2;
		else	return -1;
	}
}