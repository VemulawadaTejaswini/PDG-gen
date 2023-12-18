import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result = 0;
		for (int i = 1; i < 4; i++) {
		if (A==i || B==i){

		} else {
			result = i;
		}
	}
	System.out.println(result);
	}}