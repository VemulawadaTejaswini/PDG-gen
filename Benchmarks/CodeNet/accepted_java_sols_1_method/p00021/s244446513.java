import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = 0 ; i < num ; i++){
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			double x3 = input.nextDouble();
			double y3 = input.nextDouble();
			double x4 = input.nextDouble();
			double y4 = input.nextDouble();
			if((y2-y1)/(x2-x1) == (y4-y3)/(x4-x3)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		input.close();
	}
}