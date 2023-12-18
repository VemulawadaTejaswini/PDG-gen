import java.util.*;
public class HauntedHouse {
	static Scanner sc = new Scanner(System.in);
	static String[] name = new String[9];
	static int[][] Array = new int[9][2];
	
	public static void main(String[] args) {
		for(int i = 0; i < 9; i++){
			read();
			slove();
		}

	}
	static boolean read(){
		String line;
		String[] devide = new String[3];
		
		for(int i = 0; i < 9; i++){
			line = sc.nextLine();
			devide = line.split(" ");
			name[i] = devide[0];
			Array[i][0] = Integer.parseInt(devide[1])
							+Integer.parseInt(devide[2]);
			Array[i][1] = Integer.parseInt(devide[1])*200
			+Integer.parseInt(devide[2])*300;
		}
		return true;
	}
	static void slove(){
		for(int i = 0; i < 9; i++){
			System.out.print(name[i] + " ");
			System.out.print(Array[i][0] + " ");
			System.out.println(Array[i][1]);
		}
	}
}