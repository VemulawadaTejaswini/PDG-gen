import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int studentCount = stdIn.nextInt();
		float[] studentHeight = new float[studentCount];
		for(int i=0;i<studentCount;i++){
			studentHeight[i] = stdIn.nextFloat();
		}
//		int midasi1 = 0,midasi2 = 0,midasi3 = 0,midasi4 = 0,midasi5 = 0,midasi6 = 0;
		int[] midasi = new int[6];
		for(float i:studentHeight){
			if(i < 165.0){
				midasi[0]++;
			}else if(165.0 <= i & i < 170.0){
				midasi[1]++;
			}else if(170.0 <= i & i < 175.0){
				midasi[2]++;
			}else if(175.0 <= i & i < 180.0){
				midasi[3]++;
			}else if(180.0 <= i & i < 185.0){
				midasi[4]++;
			}else if(185.0 <= i){
				midasi[5]++;
			}
		}
		for(int i = 0; i < midasi.length;i++){
			System.out.print((i + 1) + ":");
			for(int j = 0;j < midasi[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}