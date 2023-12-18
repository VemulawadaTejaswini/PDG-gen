import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[] point = new double[6];
		int n = scan.nextInt();
		for(int i = 0;i < n;i++){
			for(int j = 0;j < 6;j++){
				point[j] = scan.nextDouble();
			}
			double l = len(point[0],point[1],point[3],point[4]);
			double r = point[2] + point[5];
			if(l-r > 0.00001){
				System.out.println(0);
			}else{
				if(l <= point[2]){
					System.out.println(2);
				}else if(l <= point[5]){
					System.out.println(-2);
				}else{
					System.out.println(1);
				}
			}
		}
	}
	public static double len(double x1,double y1,double x2,double y2){
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
}