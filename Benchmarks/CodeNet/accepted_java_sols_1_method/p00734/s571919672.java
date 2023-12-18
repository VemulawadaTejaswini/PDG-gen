import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int sumA = 0;
			int[] cardA = new int[n];
			int[] cardB = new int[m];
			int sumB = 0;
			for(int i = 0;i < n;i++){
				cardA[i] = scan.nextInt();
				sumA += cardA[i];
			}
			for(int i = 0;i < m;i++){
				cardB[i] = scan.nextInt();
				sumB += cardB[i];
			}
			if((sumA+sumB)%2 != 0){
				System.out.println(-1);
				continue;
			}
			Arrays.sort(cardA);
			Arrays.sort(cardB);
			boolean fl = true;
			int sum = sumA - sumB;
			for(int i = 0;i < n;i++){
				for(int j = 0;j < m;j++){
					if(sum == 2*(cardA[i]-cardB[j])){
						fl = false;
						System.out.println(cardA[i] + " " + cardB[j]);
						break;
					}
				}
				if(!fl){
					break;
				}
			}
			if(fl){
				System.out.println(-1);
			}
		}
	}
}