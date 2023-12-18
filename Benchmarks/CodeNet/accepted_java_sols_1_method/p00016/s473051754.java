import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x=0,y=0,angle=0;
		
		while(true){
			String string = sc.nextLine();
			String[] string_array = string.split(",");
			double[] double_input = {Double.valueOf(string_array[0]), Double.valueOf(string_array[1])};
			
				if(double_input[0]==0 && double_input[1]==0) break;
				
			x=x + double_input[0]*Math.cos(Math.toRadians(90-angle));
			y=y + double_input[0]*Math.sin(Math.toRadians(90-angle));
			angle=angle+double_input[1];
		}
		
		System.out.println((int)x);
		System.out.println((int)y);
	}
}