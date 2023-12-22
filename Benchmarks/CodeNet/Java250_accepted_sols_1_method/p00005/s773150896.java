import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			long i = 1;
			long[][] gcdlcm = new long[2][2];
			gcdlcm[0][0] = scan.nextLong();
			gcdlcm[0][1] = scan.nextLong();
			gcdlcm[1][0] = gcdlcm[0][0];
			gcdlcm[1][1] = gcdlcm[0][1];
			
			while(i != 0){
				i = gcdlcm[0][0] % gcdlcm[0][1];
				gcdlcm[0][0] = gcdlcm[0][1];
				gcdlcm[0][1] = i;
			}
			System.out.println(gcdlcm[0][0]+ " " + (gcdlcm[1][0] * gcdlcm[1][1] / gcdlcm[0][0]));
		}
	}
}