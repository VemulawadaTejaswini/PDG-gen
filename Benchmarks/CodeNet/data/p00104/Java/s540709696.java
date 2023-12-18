
import java.util.Scanner;

class Main{


	public static void main(String[] a){

		Scanner sc = new Scanner (System.in);



		while(sc.hasNext()) {

			int height = sc.nextInt();
			int width = sc.nextInt();

			if(height == 0 && width == 0){break;}

			String tile[][] = new String[height][width];



			for(int i = 0;i < height; i++) {
				for(int j = 0; j < width; j++) {
					sc.useDelimiter("(?<=.)");
					tile[i][j] = sc.next();
					sc.reset();

				}
			}

			 int cY = 0;
			 int cX = 0;

			 int i = 0;
			while(true){

				String curZahyo = tile[cY][cX].replace("\r\n", "");

				if(curZahyo.equals(">")) {
					cX++;
				}else if(curZahyo.equals("<")) {
					cX--;
				}else if(curZahyo.equals("^")) {
					cY--;
				}else if(curZahyo.equals("v")) {
					cY++;
				}else{
					System.out.println(cX + " " + cY);
					break;
				}
				i++;
				if(i > (height * width * 2)) {
					System.out.println("LOOP");
					break;
				}
			}


		}

	}
}