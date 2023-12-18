import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int[][][] array = new int [4][3][10];
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i = 0; i<num; i++){
			int building = sc.nextInt();
			int floor = sc.nextInt();
			int room_num = sc.nextInt();
			int change = sc.nextInt();
			array[building-1][floor-1][room_num-1] += change;
		}

		for(int j = 0; j<4; j++){
			for(int k = 0; k<3; k++){
				for(int l = 0; l<10; l++){
					System.out.print(" "+array[j][k][l]);
				}
				System.out.println();
			}
			if(j!=3){
				System.out.println("####################");
			}
		}
	}
}
