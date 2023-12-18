import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str;
		int[]  s = new int[51];
		double[][] bmi = new double[3][51];
		int n = 0;
		
		while(true){
			str = scan.next();
			if(str.equals("0"))break;
			String[] num = str.split(",", 0);
			
			s[n] = Integer.parseInt(num[0]);
			bmi[0][n] = Double.valueOf(num[1]);
			bmi[1][n] = Double.valueOf(num[2]);
			
			bmi[2][n] = bmi[0][n] / Math.pow(bmi[1][n], 2);
			n++;
		}
		
		for(int i = 0; i < n; i++){
			if(bmi[2][i] >= 25)System.out.println(s[i]);
		}
	}
}