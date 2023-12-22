import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			String s = sc.next();

			int count = 0;
			int len = s.length();
			char[] sArray = s.toCharArray();
			int[] residuals = new int[2019];
			for(int i = 0 ; i <len ; i++ ) {
				
				int current = (int)sArray[i] - 48;
//				System.out.println("## " + current);
				
				int[] newResiduals = new int[2019];
				for(int j = 0 ; j < 2019 ; j++ ) {
					int num = j * 10 + current;
					int newResidual = num % 2019;
					newResiduals[newResidual] += residuals[j];
				}
				newResiduals[current]++;
				residuals = newResiduals;
				
				count += residuals[0];
			}
			
			System.out.println(count);
		}
	}

}