import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num[] = new int [7];
		int cnt = in.nextInt();
		for(int i = 0;i < cnt;i++){
			double a = in.nextDouble();
			if(a < 165.0){
				num[1]++;
			}else if(a >= 165.0 && a < 170.0){
				num[2]++;
			}else if(a >= 170.0 && a < 175.0){
				num[3]++;
			}else if(a >= 175.0 && a < 180.0){
				num[4]++;
			}else if(a >= 180.0&& a < 185.0){
				num[5]++;
			}else if(a >= 185.0){
				num[6]++;
			}
		}
		for(int i = 1;i < 7;i++){
			System.out.print(i+":");
			for(int j = 0;j < num[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}