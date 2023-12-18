import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[][] sight = new int[4][2]; 
		while(scan.hasNext()){
			double left = scan.nextDouble();
			double right = scan.nextDouble();
			if(left >= 1.1){
				sight[0][0]++;
			}else if(left >= 0.6){
				sight[1][0]++;
			}else if(left >= 0.2){
				sight[2][0]++;
			}else{
				sight[3][0]++;
			}
			if(right >= 1.1){
				sight[0][1]++;
			}else if(right >= 0.6){
				sight[1][1]++;
			}else if(right >= 0.2){
				sight[2][1]++;
			}else{
				sight[3][1]++;
			}
		}
		for(int i = 0;i < 4;i++){
			System.out.println(sight[i][0] + " " + sight[i][1]);
		}
	}
}