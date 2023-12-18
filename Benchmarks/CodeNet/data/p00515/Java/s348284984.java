import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] p = new int[5];
		for(int i = 0; i < 5; i++) {
			p[i] = stdIn.nextInt();
			if(p[i] < 40) {
				p[i] = 40;
			}
		}
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += p[i];
		}
		System.out.println(sum/5);
		
	}

}