import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int[] num = new int[10];
	for(int i = 0; i < num.length; i++){
	    num[i] = stdin.nextInt();
	}
	Arrays.sort(num);
	for(int i = 1; i <= 3; i++){
	    System.out.println(num[num.length - i]);
	}
    }
}