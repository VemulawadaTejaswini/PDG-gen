import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int divCount=0;
		int matchCnt=0;

		for (int i = 1; i <= N; i += 2) {
			divCount=0;
			for (int j = 1; j <= i; j += 2) {
              if(i%j==0){
            	  divCount++;
              }
			}
			if(divCount==8){
				matchCnt++;
			}
		}
		
		System.out.println(matchCnt);
	}
}