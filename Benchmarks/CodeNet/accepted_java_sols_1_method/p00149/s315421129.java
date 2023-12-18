import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[][] a = new int[4][2];
		while(cin.hasNext()){
			for(int i = 0;i<2;i++){
				double left = cin.nextDouble();
				if(left < 0.2){
					a[3][i]++;
				}
				else if(left < 0.6){
					a[2][i]++;
				}
				else if(left < 1.1){
					a[1][i]++;
				} 
				else{
					a[0][i]++;
				} 

			}

		}
		for(int i = 0;i<4;i++){
			System.out.println(a[i][0]+" "+a[i][1]);
		}
	}

}