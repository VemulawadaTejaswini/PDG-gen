import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float num[] = new float[6];

		while(scan.hasNextFloat()){
			for(int i=0; i<6;i++){
				num[i] = scan.nextFloat();
			}

			float det = num[0]*num[4] - num[1]*num[3];
			float x = (num[1]*num[5] - num[4]*num[2])/det;
			float y = (num[2]-num[0]*x)/num[1];

			System.out.printf("%.3f %.3f",x,y);
			
		}
	}
}