import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buf.readLine());
		int[][][] house = new int[4][3][10];
		String[] str;
		int building,floor,room,people;

		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<10; k++){
					house[i][j][k] = 0;
				}
			}
		}
		for(int i=0; i<n; i++){
			str = buf.readLine().split(" ");
			building = Integer.parseInt(str[0]);
			floor = Integer.parseInt(str[1]);
			room = Integer.parseInt(str[2]);
			people = Integer.parseInt(str[3]);
			//?????°???????????????????????´???????????§???+=?????????
			house[building-1][floor-1][room-1] += people;
		}
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<10; k++){
					//printf???print???????????????????????????????????????
					System.out.print(" "+house[i][j][k]);
				}
				//if(!(i==3 && j==2))
					System.out.println();
			}
			if(i<3)
				System.out.println("####################");
		}

	}
}