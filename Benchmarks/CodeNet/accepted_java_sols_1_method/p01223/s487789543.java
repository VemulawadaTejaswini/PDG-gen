import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		for (int t = 0; t < times; t++){
			int[] data = new int[sc.nextInt()];
			int upmax = 0, downmax = 0;
			
			for (int i = 0; i < data.length ; i++){
				data[i] = sc.nextInt();
			}
			
			for (int i = 0; i < data.length - 1; i++){
				int s = data[i+1] - data[i];
				if((s > 0) && (s > upmax)){
					upmax = s;
				}
				
				if((s < 0) && (-s > downmax)){
					downmax = -s;
				}
			}
			
			System.out.print(upmax + " " + downmax + "\n");
		}
	}
}