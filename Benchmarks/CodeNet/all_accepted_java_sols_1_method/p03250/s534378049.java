import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();

	int[] money = new int[3];
	money[0] = a;
	money[1] = b;
	money[2] = c;

	Arrays.sort(money);

	int sum = money[2]*10+money[1]+money[0];

	System.out.println(sum);
    }
}
