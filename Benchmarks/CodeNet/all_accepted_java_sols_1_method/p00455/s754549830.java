import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h, m, s;
		int outH, outM, outS;
		int[][] time = new int[3][3];
		
		for(int i = 0; i < 3; i++){
			h = scan.nextInt();
			m = scan.nextInt();
			s = scan.nextInt();
			outH = scan.nextInt();
			outM = scan.nextInt();
			outS = scan.nextInt();
			
			if(outS < s){
				outS += 60;
				outM--;
			}time[i][2] = outS - s;
			if(outM < m){
				outM += 60;
				outH--;
			}time[i][1] = outM - m;
			time[i][0] = outH - h;
		}
		
		for(int i = 0; i < 3; i++){
			System.out.println(time[i][0] + " " + time[i][1] + " " + time[i][2]);
		}
	}
}