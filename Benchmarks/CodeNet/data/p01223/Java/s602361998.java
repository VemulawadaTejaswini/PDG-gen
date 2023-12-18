import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int[] max = new int[N];
		int[] min = new int[N];
		int[] num = new int[N];
		for(int i = 0; i < N; i++){
			num[i] = stdIn.nextInt();
			int[] box = new int[num[i]];
			box[0] = stdIn.nextInt();
			for(int j = 1; j < num[i]; j++){
				box[j] = stdIn.nextInt();
				int temp = box[j]-box[j-1];
				if( temp > max[i] ){
					max[i] = temp;
				} else if( temp < min[i] ){
					min[i] = temp;
				}
			}
		}
		for(int i = 0; i < N; i++){
			if( min[i] < 0 ){
				min[i] = -min[i];
			}
			System.out.println(max[i] + " " + min[i]);
		}
	}
}