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
					tile[cY][cX] = "h";
					cX++;
				}else if(curZahyo.equals("<")) {
					tile[cY][cX] = "h";
					cX--;
				}else if(curZahyo.equals("^")) {
					tile[cY][cX] = "h";
					cY--;
				}else if(curZahyo.equals("v")) {
					tile[cY][cX] = "h";
					cY++;
				}else if(curZahyo.equals("h")) {
					System.out.println("LOOP");
					break;
				}else{
					System.out.println(cX + " " + cY);
					break;
				}
			}


		}

	}
}