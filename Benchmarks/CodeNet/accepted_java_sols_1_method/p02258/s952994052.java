import java.util.Scanner;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] num = new int[input];
		
		for(int c = 0; c < input; c++){
			num[c] = scan.nextInt();
		}
		
		int max = num[1] - num[0];
		
		/*for(int j = 1; j < input - 1; j++){
			for(int i = 0; i< j - 1; i++){
				max = Math.max(max, num[j] - num[i]);
			}
		}*/
		
		int min = num[0];
		for(int j = 1; j <= input - 1; j++){
			max = Math.max(max, num[j] - min);
			min = Math.min(min, num[j]);
		}
		
		System.out.println(max);
	}
}