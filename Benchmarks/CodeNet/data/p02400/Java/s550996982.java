
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		
		//スキャナーで半径rを読み取る
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.next();
	    double r = Double.parseDouble(s1);
	    
	    //面積sと円周lを求める
	    double s = Math.PI * r * r;
	    double l = Math.PI * (r + r);
	    
	    //Eを表示させないように少数点第5位までの表示にする
	    int a = (int)(s * 100000);
	    s = ((double)a) / 100000;
	    int b = (int)(l * 100000);
	    l = ((double)b) / 100000;
	    
	    //面積sと円周lを表示する
	    System.out.println(s + " " + l);
	    
		
	}

}