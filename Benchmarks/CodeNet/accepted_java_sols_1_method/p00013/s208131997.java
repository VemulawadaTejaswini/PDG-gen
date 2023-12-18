import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] Cars = new int[10];
		int current = 0;
		int input;
		
		while(scan.hasNextInt()){
			input = scan.nextInt();
			if(input == 0){
				if(current > 0){
					System.out.println(Cars[current-1]);
					current--;
				}
			}else{
				Cars[current] = input;
				current++;
			}
		}
	}
}