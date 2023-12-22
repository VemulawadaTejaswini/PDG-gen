//Volume1-0149
import java.util.Scanner;

class Main {

	public static void main(String[] arg){

		int     rl  = 0;
		int[][] eye = new int[2][4];
		double	n;

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			n = sc.nextDouble();
			if(n >= 1.1){
				eye[rl][0]++;
			} else if(n < 1.1 && n >=0.6){
				eye[rl][1]++;
			} else if(n < 0.6 && n >=0.2){
				eye[rl][2]++;
			} else {
				eye[rl][3]++;
			}
			rl = 1 - rl;
		}

		for(int i=0;i<4;i++){
			System.out.println(eye[0][i] + " " + eye[1][i]);
		}
	}
}