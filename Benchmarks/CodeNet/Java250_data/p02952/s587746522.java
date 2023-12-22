import java.util.Scanner;

public class Main{
	public static void main(String arge[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		// 1 <= N <= 100000
		int printNum = 0;
		int ketasuu = cheackKetasuu(N);
		if(ketasuu == 1 ){
			printNum = N;
		}else if(ketasuu == 2){
			printNum = 9;
		}else if(ketasuu == 3){
			printNum = 9 + N -99;
		}else if(ketasuu == 4){
			printNum = 9 + 900;
		}else if(ketasuu == 5){
			printNum = 9 + 900 + N - 9999;
		}else if(ketasuu == 6){
			printNum = 9 + 900 + 90000;
		}
		// System.out.println(ketasuu);
		System.out.println(printNum);

	}

	public static int cheackKetasuu(int N){
		int ketasuu = 0;
		int count = 6;
		for(int i = 100000;1 <= i;i /=10){
			if(1 <= N / i){
				ketasuu = count;
				break;
			}
			count --;
		}
		return ketasuu;
	}
}