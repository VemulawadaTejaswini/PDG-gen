import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x1,y1,x2,y2;
		double answer;
		Double[] d = new Double[4];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; ++i){
			d[i] = sc.nextDouble();
		}
		x1 = d[0]; y1 = d[1]; x2 = d[2] = y2 = d[3];
		answer = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(answer);
		sc.close();
	}
}