import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int m = stdIn.nextInt();
		int n = stdIn.nextInt();
		int max = 0;
		for(int i=0;i<m;i++){
			int tmp = 0;
			for(int j=0;j<n;j++){
				tmp += stdIn.nextInt();
			}
			if(tmp>max){
				max = tmp;
			}
		}
		System.out.println(max);
	}
}