import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double r,s,l;

	    try (Scanner sc = new Scanner(System.in)) {
	    	r = sc.nextDouble();
	    }

	    s = r*r*Math.PI;
	    l = 2*r*Math.PI;

	    System.out.println(String.format("%.6f %.6f",s, l));
	}

}
