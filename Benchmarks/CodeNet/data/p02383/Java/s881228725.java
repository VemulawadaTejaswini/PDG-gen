import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String str[] = br.readLine().split("\\s+");
			int array[] = new int[str.length];

			for(int i = 0; i < str.length; i++){
				array[i] = Integer.parseInt(str[i]);
			}

			Dice dice = new Dice();
			dice.setnumber(array[0], array[1], array[2], array[3], array[4], array[5]);

			String order = br.readLine();

			for(int i = 0; i < order.length(); i++){
				dice.roll(order.charAt(i));
			}

			System.out.println(dice.getTop());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Dice{

	private int number[];
	private int work[];

	Dice(){
		number = new int[6];
		work = new int[6];
	}


	public void roll(char dst){
		for(int i = 0; i < 6; i++) work[i] = number[i];
		switch(dst){
		case 'E':
			setnumber(work[3],work[1],work[0],work[5],work[4],work[2]);
			break;
		case 'S':
			setnumber(work[1],work[5],work[2],work[3],work[0],work[4]);
			break;
		case 'N':
			setnumber(work[4],work[0],work[2],work[3],work[5],work[1]);
			break;
		case 'W':
			setnumber(work[2],work[1],work[5],work[0],work[4],work[3]);
			break;
		}
	};

	public int getTop(){
		return number[0];
	}

	public void setnumber(int n0,int n1,int n2,int n3,int n4,int n5){
		number[0] = n0;
		number[1] = n4;
		number[2] = n2;
		number[3] = n3;
		number[4] = n1;
		number[5] = n5;
	}
};

