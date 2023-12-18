import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int[] bil;
		bil = new int[11];
		for(int i = 1; i <= 10; i++){
		bil[i] = reader.nextInt();
		}
		for(int i = 1; i <= 3; i++){
			int max = bil[0];
			int nomor = 0;
			for(int j = 1; j <= 10; j++){
				if (max < bil[j]){
					max = bil[j];
					nomor = j;
				}
			}
			bil[nomor]=0;
			System.out.println(max);
		}
	}
}