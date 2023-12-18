import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int[] side = new int[6];

		for(int i = 0; i < 6; i++){
			side[i] = Integer.parseInt(str[i]);
		}
		Dice dice = new Dice(side);
		char[] ca = br.readLine().toCharArray();
		for(char c : ca){
			switch(c){
			case 'N':
				dice.N();
				break;
			case 'E':
				dice.E();
				break;
			case 'W':
				dice.W();
				break;
			case 'S':
				dice.S();
				break;
			default:
				break;
			}
		}
		System.out.println((dice).getside(0));
	}
}
class Dice {
	private int[] side = new int[6];
	Dice(int[] side){
		this.side = side;
	}
	public void N(){
		int temp = side[0];
		side[0] = side[1];
		side[1] = side[5];
		side[5] = side[4];
		side[4] = temp;
 	}
	public void E(){
		int temp = side[0];
		side[0] = side[3];
		side[3] = side[5];
		side[5] = side[2];
		side[2] = temp;
	}
	public void W(){
		int temp = side[0];
		side[0] = side[2];
		side[2] = side[5];
		side[5] = side[3];
		side[3] = temp;
	}
	public void S(){
		int temp = side[0];
		side[0] = side[4];
		side[4] = side[5];
		side[5] = side[1];
		side[1] = temp;
	}
	public int getside(int i){
		return  side[i];
	}
}