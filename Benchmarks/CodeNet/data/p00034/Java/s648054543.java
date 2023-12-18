import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in)
							.useDelimiter("[,\\s]+");

	public static void main(String[] args){
		int[] l = new int[10];
		int sum1 = 0, sum2 = 0;
		double time = 0, tX = 0;
		while(scan.hasNext()){
			for(int i = 0; i < 10; i++){
				l[i] = scan.nextInt();
			}
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			for(int i = 0; i < 10; i++){
				sum1 += l[i];
			}
			time =(double) (sum1 / (v2 + v1));
			tx =(double) v1 * time;
			for(int i = 0; i < 10; i++){
				sum2 += l[i];
				if(tx <= sum2){
					System.out.printf("%d\n", i+1);
					sum1 = 0;
					sum2 = 0;
					break;
				}
			}
		}
	}
}