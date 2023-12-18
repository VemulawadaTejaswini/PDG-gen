import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        int a = scan.nextInt();		//辺a
        int b = scan.nextInt();		//辺b
	    int c = scan.nextInt();		//角度
	    double angle = c * Math.PI /180;//角度
	    
	    //面積
	    double menseki = a * b  * Math.sin(angle) / 2;
	    
	    //dは残りの辺。Lは周の長さ
	    double L = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c)));
	    
	    //高さ
	    double h = menseki * 2 / a;
	   
	    System.out.println(menseki);
	    System.out.println(L);
	    System.out.println(h);
	}
}
