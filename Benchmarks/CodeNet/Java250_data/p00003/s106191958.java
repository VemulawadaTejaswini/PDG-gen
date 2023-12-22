import java.util.Scanner;
import java.util.Arrays;

class Main {

    static int square(int i){
	return i * i;
    }

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int limit = stdin.nextInt();
	int[] num = new int[3];
	for(int i = 0; i < limit; i++){
	    for(int j = 0; j < 3; j++){
		num[j] = stdin.nextInt();
	    }
	    Arrays.sort(num);
	    System.out.println(square(num[0]) + square(num[1]) == square(num[2]) ? "YES" : "NO");
	}
    }
}