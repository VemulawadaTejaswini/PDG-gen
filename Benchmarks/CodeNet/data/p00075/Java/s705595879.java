import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//??????????????°
		String[][] data = new String[5][3];
		double[][] keisan = new double[5][4];

		Scanner sc = new Scanner(System.in);

		for(int i =0; i<5; i++){
			String shin = sc.next();		//String????????°???1?????\??????
			data[i] = shin.split(",");		//????¬???????????????\??????
		}

		//??????(double)
		for(int x = 0; x < 5; x ++){
			for(int y = 1; y < 3; y ++){
				keisan[x][y] = Double.parseDouble(data[x][y]);
			}
		}

		//?¨????
		for(int z = 0; z < 5; z++){
			keisan[z][2] = keisan[z][2] * keisan[z][2];
			keisan[z][3] = keisan[z][1] / keisan[z][2];
		}

		for(int a = 0; a<5; a++){
			if(keisan[a][3] >= 25){
				System.out.println(data[a][0]);
			}
		}
	}
}