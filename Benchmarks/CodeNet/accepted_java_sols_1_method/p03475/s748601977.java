import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] array = new int[n-1][3];
		for(int i=0; i < n-1;i++){
			for(int j = 0; j < 3;j++){
				array[i][j] = sc.nextInt();
			}
		}
		for(int i =0; i < n-1;i++){
			int time = array[i][1];
			time += array[i][0];
			for(int j = i+1;j < n-1; j++){
				if(time < array[j][1]) time = array[j][1];
				else{
					int delay = (time - array[j][1]) % array[j][2];
					if(delay != 0) time += array[j][2] - delay;
				}
				time += array[j][0];

			}
			System.out.println(time);
		}
		System.out.println(0);
	}
}