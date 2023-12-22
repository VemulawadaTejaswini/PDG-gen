import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] numbers = new int[3];
	for (int i = 0; i < numbers.length; i++) {
	    String input = scan.next();
	    numbers[i] = Integer.parseInt(input);
	}
	for (int i = 0; i < 3; i++) {
	    int point = i;
	    for (int j = point; j < 3; j++) {
		if (numbers[point] > numbers[j]) {
		    point = j;
		}
	    }
	    int tmp = numbers[point];
	    numbers[point] = numbers[i];
	    numbers[i] = tmp;
	}
	System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}