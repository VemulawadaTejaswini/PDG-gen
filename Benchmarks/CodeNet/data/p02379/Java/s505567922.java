import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x1=0.0,y1=0.0,x2=0.0,y2=0.0;
		double dx=0.0,dy=0.0;
		double answer;
		Double[] d = new Double[4];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; ++i){
			d[i] = sc.nextDouble();
		}
		x1 = d[0]; y1 = d[1]; x2 = d[2] = y2 = d[3];
		dx = Math.pow(x2-x1, 2);
		dy = Math.pow(y2-y1, 2);
		answer = Math.sqrt(dx+dy);
		System.out.println(answer);
		sc.close();
	}
}