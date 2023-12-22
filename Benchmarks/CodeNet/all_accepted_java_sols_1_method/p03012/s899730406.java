import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt();
      	scanner.nextLine();
		String input = scanner.nextLine();
		String[] inputArray = input.split(" ");
		int minDiff = 10000;
		for(int i=1; i < max; i++){
			int s1 = 0;
			int s2 = 0;
			for(int j=0; j < max; j++){
				if (i > j){
					s1 += Integer.parseInt(inputArray[j]);
				}else{
					s2 += Integer.parseInt(inputArray[j]);
				}

			}
			int diff = s1 - s2;
			if(diff < 0){
				diff = diff * -1;
			}
			minDiff = Math.min(minDiff, diff);
		}

	    System.out.println(minDiff);
	    scanner.close();
	}
}
