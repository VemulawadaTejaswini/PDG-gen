import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	private void doit(){
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			while(n-- > 0){
				int [] data = new int[8];
				for(int i = 0; i < 8; i++){
					data[i] = sc.nextInt();
				}
				int [][] calc = new int[4][4];
				calc[0][0] = data[0] * data[4];
				calc[0][1] = data[0] * data[5];
				calc[0][2] = data[0] * data[6];
				calc[0][3] = data[0] * data[7];
				
				calc[1][0] = data[1] * data[5] * -1;
				calc[1][1] = data[1] * data[4];
				calc[1][2] = data[1] * data[7] * -1;
				calc[1][3] = data[1] * data[6];
				
				calc[2][0] = data[2] * data[6] * -1;
				calc[2][1] = data[2] * data[7];
				calc[2][2] = data[2] * data[4];
				calc[2][3] = data[2] * data[5] * -1;
				
				calc[3][0] = data[3] * data[7] * -1;
				calc[3][1] = data[3] * data[6] * -1;
				calc[3][2] = data[3] * data[5];
				calc[3][3] = data[3] * data[4];
				
				for(int i = 0; i < 4; i++){
					int sum = 0;
					for(int j = 0; j < 4; j++){
						sum += calc[j][i];
					}
					System.out.print(sum);
					if(i == 3){
						System.out.println();
					}
					else{
						System.out.print(" ");
					}
				}
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}