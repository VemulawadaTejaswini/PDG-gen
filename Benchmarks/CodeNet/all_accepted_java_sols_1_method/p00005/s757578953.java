import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double firstinput;
		double secondinput;
		double product;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			firstinput = scanner.nextDouble();
			secondinput = scanner.nextDouble();
			product = firstinput * secondinput;
			while(true){
				double tmpdouble = firstinput % secondinput;
				if(tmpdouble == 0){
					break;
				}
				firstinput = secondinput;
				secondinput = tmpdouble;
			}
			System.out.println((int)secondinput + " " + (int)(product / secondinput));
		}
	}
}