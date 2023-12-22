import java.util.Scanner;
public class  Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input1 = scan.next();
	int inputTime = Integer.parseInt(input1);
	int numberCrack = 3600;
	int[] times = new int[3];
	for (int i = 0; i < 3; i++) {
	    times[i] = inputTime / numberCrack;
	    inputTime %= numberCrack;
	    numberCrack /= 60;
	}
	System.out.println(times[0] + ":" + times[1] + ":" + times[2]);
    }
}