import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int width = in.nextInt();
		int height = in.nextInt();
		int rute = in.nextInt();
		int couse = 0;
		int[] x = new int [rute];
		int[] y = new int [rute];
		x[0] = in.nextInt();
		y[0] = in.nextInt();
		for(int i = 1;i < rute;i++){
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			if(x[i] > width || y[i] > height){
				x[i] = x[i-1];
				y[i] = y[i-1];
			}
			while(x[i] <= width && y[i] <= height){
				if(x[i-1] < x[i] && y[i-1] < y[i]){
					if(x[i]-x[i-1] > y[i]-y[i-1]) couse = couse + x[i]-x[i-1];
					else couse = couse + y[i]-y[i-1];
				}
				else if(x[i-1] > x[i] && y[i-1] > y[i]){
					if(x[i-1]-x[i] > y[i-1]-y[i]) couse = couse + x[i-1]-x[i];
					else couse = couse + y[i-1]-y[i];
				}
				else{
					if(x[i]-x[i-1] >= 0){
						couse = couse + x[i]-x[i-1];
					}
					else{
						couse = couse - x[i]+x[i-1];
					}
					if(y[i]-y[i-1] >= 0){
						couse = couse + y[i]-y[i-1];
					}
					else{
						couse = couse - y[i]+y[i-1];
					}
				}
				break;
			}
		}
		System.out.println(couse);
	}
}