import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int datalen = sc.nextInt();
			if(datalen == 0){
				break;
			}

			int sum1 = 0;
			int max = 0, min = 1000000;
			for(int i = 0; i < datalen; i++){
				int t = sc.nextInt();
				sum1 = sum1 + t;
				if (t > max){
					max = t;				
				}
				if (t < min){
					min = t;
				}
			}

			int sum2 = sum1 - max - min;
			int d = sum2 % (datalen - 2);

			System.out.println((sum2 - d) / (datalen - 2));
		}
	}
}