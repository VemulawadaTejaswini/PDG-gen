import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum [] = new int[2];
		for(int i = 0; i < 2; i++){
			for(int j = 0 ;j < 4; j++){
				sum[i] += sc.nextInt(); 
			}
		}
	 System.out.println(Math.max(sum[0],sum[1]));
	}
}