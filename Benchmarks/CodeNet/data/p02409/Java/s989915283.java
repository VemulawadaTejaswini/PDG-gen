import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException{
		
		int[][] tou1 = new int[3][10];
		int[][] tou2 = new int[3][10];
		int[][] tou3 = new int[3][10];
		int[][] tou4 = new int[3][10];
		
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		Integer num1 = Integer.parseInt(str1);
		
		
		for(int i=0; i<num1; i++) {
			
			BufferedReader br2 =
					new BufferedReader(new InputStreamReader(System.in));
			
			String[] touJyoho = new String[4];
			touJyoho = br2.readLine().split(" ");
			
			int buildNum = Integer.parseInt(touJyoho[0]);
			int floor = Integer.parseInt(touJyoho[1]) -1;
			int room = Integer.parseInt(touJyoho[2])-1;
			int person = Integer.parseInt(touJyoho[3]);
			
			if(buildNum == 1) {
				tou1[floor][room] =	tou1[floor][room] + person;
			}
			if(buildNum == 2) {
				tou2[floor][room] =	tou2[floor][room] + person;
			}
			if(buildNum == 3) {
				tou3[floor][room] =	tou3[floor][room] + person;
			}
			if(buildNum == 4) {
				tou4[floor][room] =	tou4[floor][room] + person;
			}
		}
		for(int i=0; i<tou1.length; i++) {
			String result = "";
			for(int j = 0; j < tou1[i].length; j++) {
				if( j == 0) {
					result += tou1[i][j];
				}else {
					result += " " + tou1[i][j];
				}
				
			}
			System.out.println(result);
		
		}
		System.out.println("####################");
		
		for(int i=0; i<tou2.length; i++) {
			String result = "";
			for(int j = 0; j < tou2[i].length; j++) {
				if( j == 0) {
					result += tou2[i][j];
				}else {
					result += " " + tou2[i][j];
				}
				
			}
			System.out.println(result);
		
		}
		System.out.println("####################");
		
		for(int i=0; i<tou3.length; i++) {
			String result = "";
			for(int j = 0; j < tou3[i].length; j++) {
				if( j == 0) {
					result += tou3[i][j];
				}else {
					result += " " + tou3[i][j];
				}
				
			}
			System.out.println(result);
		
		}
		System.out.println("####################");
		
		for(int i=0; i<tou4.length; i++) {
			String result = "";
			for(int j = 0; j < tou4[i].length; j++) {
				
				if( j == 0) {
					result += tou4[i][j];
				}else {
					result += " " + tou4[i][j];
				}
				
			}
			System.out.println(result);
		}
		

		
	}

}