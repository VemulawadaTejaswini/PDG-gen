import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] tmp = new int[101];
		while(stdIn.hasNext()) {
			tmp[stdIn.nextInt()]++;
		}
		Arrays.sort(tmp);
		int max = 0;
		for(int i = 0; i < 101; i++) {
			if(tmp[i] > max) {
				max = tmp[i];
			}
		}
		for(int i = 0; i < 101; i++) {
			if(tmp[i] == max) {
				System.out.println(i);
			}
		}
			
	}
}