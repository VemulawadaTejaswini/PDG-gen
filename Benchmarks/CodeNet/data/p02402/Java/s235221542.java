import java.util.ArrayList;
import java.util.Scanner;

public class ITP1_4D {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Scanner stdInLine = new Scanner(System.in);
		int sum = 0;
		int n = stdIn.nextInt();
		
		String line = stdInLine.nextLine();
		String[] input = line.split(" ");
		
		ArrayList<Integer> integerInput = new ArrayList<Integer>();
		
		for(int i = 0;i<input.length;i++){
			integerInput.add(Integer.parseInt(input[i]));
		}
		
		int min = integerInput.get(0);
		int max = integerInput.get(0);
		
		for(int i = 0;i<integerInput.size();i++){
			int temp = integerInput.get(i);
			if(temp > max){
				max = temp;
			}
			if(temp < min){
				min = temp;
			}
			sum += temp;
		}
		
		System.out.println(min + " " + max + " " + sum);
		
		
		
		stdIn.close();
		stdInLine.close();
	}
		

}