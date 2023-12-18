import java.util.Scanner;

class Main{


	public static void main(String[] a){

		Scanner sc = new Scanner (System.in);



		while(sc.hasNext()) {

			int height = sc.nextInt();
			int width = sc.nextInt();

			if(height + width == 0){break;}

			String tile[][] = new String[height][width];

			sc.useDelimiter("(?<=.)");

			for(int i = 0;i < height; i++) {
				for(int j = 0; j < width; j++) {


					if(j == 0) {
						tile[i][j] = sc.next().replace("\r\n", "");
					}else{
						tile[i][j] = sc.next();
					}
				}
			}

			sc.reset();

			 int cY = 0;
			 int cX = 0;

			 int i =0;
			while(i ==0){

				String curZahyo = tile[cY][cX];


				switch(curZahyo) {
				case ">":
					tile[cY][cX] = "h";
					cX++;
					break;
				case "<":
					tile[cY][cX] = "h";
					cX--;
					break;
				case "^":
					tile[cY][cX] = "h";
					cY--;
					break;
				case "v":
					tile[cY][cX] = "h";
					cY++;
					break;
				case "h":
					System.out.println("LOOP");
					i = 1;
					break;
				case ".":
					System.out.println(cX + " " + cY);
					i = 1;
					break;


				}

			}


		}

		sc.close();
	}
}