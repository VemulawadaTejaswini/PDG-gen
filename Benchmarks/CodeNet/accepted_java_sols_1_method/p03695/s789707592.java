import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		// input
		int num = scan.nextInt();
		int[] color = new int[9];
		for(int i = 0; i < num; i++){
			int temp = scan.nextInt() / 400;
			if(temp < 8 && color[temp] == 0){
				color[temp] += 1;
			} else if(temp >= 8) {
				color[8] += 1;
			}
		}
		
		// search
		int count = 0;
		for(int i = 0; i < 8; i++){
			count += color[i];
		}
		
		// answer
		if(count == 0){
			System.out.println("1 " + color[8]);
		} else {
			System.out.println(count + " " + (count + color[8]));
		}
		
	}
}