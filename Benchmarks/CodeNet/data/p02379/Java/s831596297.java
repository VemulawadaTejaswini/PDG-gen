import java.util.*;
import java.lang.Math;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine.().split("");
		double x1=double.parseDouble(line[0]);
		double y1=double.parseDouble(line[1]);
		double x2=double.parseDouble(line[2]);
		double y2=double.parseDouble(line[3]);
		double n=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		double answer = Math.sqrt(n);
		System.out.printf("%.5f",answer);
		System.out.println();
	}
}