import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String HArray[][];
		HArray = new String[H][W];

		int flagArray[][];
		flagArray = new int[H][W];

		//　空読み
		sc.nextLine();



		for(int i = 0; i < H; i++) {
			String line = sc.nextLine();
	        String[] array = line.split("");

	        for(int j = 0; j < array.length; j++) {
	        HArray [i][j] = array[j];
	        flagArray [i][j] = 0;
	        }
		}



		boolean flag = false;

		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
		        String a = HArray [i][j];
		        if(a.equals("#")) {
		        	flag = true;
		        }
		        //System.out.print(a);
		    }
			if(flag == false) {
				for(int j = 0; j < W; j++) {

			        flagArray[i][j] = -1;
			        //System.out.print(a);
			    }
			}

			//System.out.println();
			flag = false;
	    }


		for(int i = 0; i < W; i++) {
			for(int j = 0; j < H; j++) {
		        String a = HArray [j][i];
		        if(a.equals("#")) {
		        	flag = true;
		        }
		        //System.out.print(a);
		    }
			if(flag == false) {
				for(int j = 0; j < H; j++) {

			        flagArray[j][i] = -1;
			        //System.out.print(a);
			    }
			}

			//System.out.println();
			flag = false;
	    }



		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {

		        if(flagArray[i][j] == 0) {
		        System.out.print(HArray [i][j]);
		        flag = true;
		        }
		        }
			if(flag == true) {
			System.out.println();
			}
			flag = false;
	        }

		sc.close();
	}

}