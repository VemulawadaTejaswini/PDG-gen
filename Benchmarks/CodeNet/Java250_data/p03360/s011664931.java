import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int[] num = new int[3];
	for(int i = 0; i < 3; i++){
	    num[i] = scan.nextInt();
	}
	int k = scan.nextInt();

	Arrays.sort(num);
	for(int i = 1; i <= k; i++){
	    num[2] *= 2;
	}

	int sum = 0;
	for(int i = 0; i < 3; i++){
	    sum += num[i];
	}

	System.out.println(sum);
    }
}
