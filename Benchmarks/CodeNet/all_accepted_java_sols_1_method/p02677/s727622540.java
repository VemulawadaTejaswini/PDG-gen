import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int lenHour=scn.nextInt(),
			lenMin=scn.nextInt();
		double hour=scn.nextDouble()/6*Math.PI,
			   min=scn.nextDouble()/30*Math.PI;
		
		hour+=min/12;
		
		System.out.println(Math.sqrt(lenHour*lenHour+lenMin*lenMin-2*lenMin*lenHour*Math.cos(min-hour)));
	}

}
