import java.util.*;


public class Main {
	public static void main(String[] args){
		double r, ce, cf;
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		//キーボードからr(半径の値)を入力
		ce = Math.pow(r,2)*Math.PI;
		//円の面積
		cf = 2*r*Math.PI;
		//円周
		System.out.printf("%f %f",ce,cf);
	}
}