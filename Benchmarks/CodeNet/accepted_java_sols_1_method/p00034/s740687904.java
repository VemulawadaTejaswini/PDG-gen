import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in)
							.useDelimiter("[,\\s]+");

	public static void main(String[] args){
		
		int[] l = new int[10];
		while(scan.hasNext()){
			int sum = 0;
			for(int i = 0; i < 10; i++){
				l[i] = scan.nextInt();
				sum += l[i];
			}
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			double time = 0, xD = 0;
			time = (double) sum / (double)(v2 + v1);
			xD =(double) v1 * time;
			sum = 0;
			for(int i = 0; i < 10; i++){
				sum += l[i];
				if(xD <= sum){
					System.out.printf("%d\n", i+1);
					break;
				}
			}
		}
	}
}