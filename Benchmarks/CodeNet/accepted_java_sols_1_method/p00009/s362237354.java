import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		int max = 1000000;
		boolean[] af = new boolean[max];
		Integer[] ai = new Integer[max];
		Arrays.fill(af, true);
		Arrays.fill(ai, 0);
		af[0] = false;
		af[1] = false;
		int sum = 0;
		for(int i = 2 ;i < max; i++ ){
			if(af[i] == true){
				sum++;
				for(int j = 2*i;j< max;j= j+i){
					af[j]= false;
				}
			}
			ai[i] = sum;
		}
		
		Scanner in = new Scanner(System.in);
		while((in.hasNext())){
			
			System.out.println(ai[Integer.parseInt(in.nextLine())]);
			}
		
		
	}

}