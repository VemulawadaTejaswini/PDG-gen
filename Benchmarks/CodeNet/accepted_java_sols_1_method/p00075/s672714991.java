import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//??????????????°
		String[][] data = new String[50][3];
		double[][] keisan = new double[50][4];

		Scanner sc = new Scanner(System.in);
		int i = 0;

		while(sc.hasNext()){

			String shin = sc.next();		//String????????°???1?????\??????

			data[i] = shin.split(",");		//????¬???????????????\??????
			i++;
		}

		//??????(double)
		for(int x = 0; x < i; x ++){
			for(int y = 1; y < 3; y ++){
				keisan[x][y] = Double.parseDouble(data[x][y]);
			}
		}

		//?¨????
		for(int z = 0; z < i; z++){
			keisan[z][2] = keisan[z][2] * keisan[z][2];
			keisan[z][3] = keisan[z][1] / keisan[z][2];
		}

		for(int a = 0; a<i; a++){
			if(keisan[a][3] >= 25){
				System.out.println(data[a][0]);
			}
		}
	}
}