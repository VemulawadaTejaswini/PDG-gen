import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args){
		double ce, cf;
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		//キーボードからr(半径の値)を入出力
		double r = Double.parseDouble(a);
		ce = Math.pow(r,2)*Math.PI;
		//円の面積⇒r二乗(Math.pow(値,何乗))*円周率（Math.PI）
		cf = 2*r*Math.PI;
		//円周⇒2*r*円周率
		System.out.printf("%f %f",ce,cf);
		//計算結果を10進数の形式で出力
	}
}