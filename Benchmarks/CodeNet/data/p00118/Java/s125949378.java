import java.util.Scanner;



class Main{
	static int h,w,count;
	static String [][]map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			h = sc.nextInt();
			w = sc.nextInt();
			if(h == 0 && w == 0)break;
			map = new String[h][w];
			count = 0;
			for(int i = 0; i < h; i++){
				char temps[] = sc.next().toCharArray();
				for(int j = 0; j < w; j++){
					map[i][j] = String.valueOf(temps[j]);
				}
			}
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(!map[i][j].equals("N")){
						doing(map[i][j],i,j);
						count++;
						/*
					for(int k = 0; k < h; k++){
						for(int l = 0; l < w; l++){
							System.out.print(map[k][l]);
						}
						System.out.println();
					}
					System.out.println();
						 */
					}
				}
			}
		}

		System.out.println(count);
	}
	static void doing(String temp, int i, int j){

		if(judge(i,j)){
			if(map[i][j].equals(temp)){
				map[i][j] = "N";
				if(judge(i + 1, j)){
					doing(temp,i + 1, j);
				}
				if(judge(i - 1, j)){
					doing(temp,i - 1, j);
				}

				if(judge(i, j + 1)){
					doing(temp,i, j + 1);
				}
				if(judge(i, j - 1)){
					doing(temp,i, j - 1 );
				}
			}


		}
	}
	static boolean judge(int x, int y){
		if(h <= x || x < 0 || y < 0 || y >= w ){
			return false;
		}else {
			return true;
		}

	}

}