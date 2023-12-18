
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		
		//スキャナーで整数を2つ読み取る
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.next();
	    int a = Integer.parseInt(s1);
	    String s2 = sc.next();
	    int b = Integer.parseInt(s2);
	    double p = Math.pow(10, 9);
	    
	    //a、bが指定の条件(1から１０の９乗)内にあるか確認
	    if(1 <= a && a <= p){
	    	if(1 <= b && b <= p){
	    		//計算
	    		int d = a / b;
	    		int r = a % b;
	    		double f = (double)a / (double)b;
	    		
	    		//計算結果を表示
	    		System.out.println(d + " " + r + " " + String.format("%1$3f",f));
	    	}
	    }
	}
}