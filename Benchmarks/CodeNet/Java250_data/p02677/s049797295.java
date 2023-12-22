import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
  		int A = sc.nextInt();
  		int B = sc.nextInt();
  		int H = sc.nextInt();
  		int M = sc.nextInt();
  
  		double kakudoTansin = 30 * H + 0.5 * M;
  		double kakudoTyousin = 6 * M;
  		double kakudo = Math.abs(kakudoTansin - kakudoTyousin);
  		if(kakudo > 180){
        		kakudo = 360-kakudo;
        }
  		double cnizyou = A * A + B * B - 2 * A * B * Math.cos(kakudo*(Math.PI/180));
        double c = Math.sqrt(cnizyou);
  		System.out.println(c);
	}
}