import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String n = sc.nextLine();
			if("0".equals(n)) break;
			int[][] array = new int[Integer.parseInt(n)][4];
			//int[] jud = new int[4];
			for(int i = 0 ; i < array.length ; i++){
				String data = sc.nextLine();
				String[] adata = data.split(" ");
				for(int j = 0 ; j < adata.length ; j++){
					array[i][j] = Integer.parseInt(adata[j]);
				}
			}
			String max = sc.nextLine();
			String[] amax = max.split(" ");
			int p = Integer.parseInt(amax[0]);
			int q = Integer.parseInt(amax[1]);
			int r = Integer.parseInt(amax[2]);
			int c = Integer.parseInt(amax[3]);
			for(int i = 0 ; i < array.length ; i++){
				if(array[i][1] > p || array[i][2] > q || array[i][3] > r || 4 * array[i][1] + 9 * array[i][2] + 4 * array[i][3] > c){
					array[i][0] = 0;
				}
			}
			int sum = 0;
			for(int i = 0 ; i < array.length ; i++){
				if(array[i][0] != 0){
					System.out.println(array[i][0]);
				}
				sum += array[i][0];
			}
			if(sum == 0 ) System.out.println("NA");
		}
		sc.close();
	}

}