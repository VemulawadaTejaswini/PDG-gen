import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){break;}
			int score[]=new int[n];
			for(int i = 0;i<n;i++){
				score[i]=cin.nextInt();
			}
			Arrays.sort(score);
			int sum=0;
			for(int i = 1;i<n-1;i++){
				sum+=score[i];
			}
			System.out.println(sum/(n-2));
		}
	}

}