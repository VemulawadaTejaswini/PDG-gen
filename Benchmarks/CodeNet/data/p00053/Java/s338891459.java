import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, ans;
	static double p[];
	static double[] count = new double[10500];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ans = 0;
		while(read()){
			slove();
		}

	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)
			return false;
		
		return true;
	}
	static void slove(){
		Prime(n);
		System.out.println((int)count[n]);
	}
	static void Prime(int a){
		p = new double[110000+1];
		int j = 1;
		count[0] = 0;
		for(int i = 0; i < p.length; i++)
			p[i] = 1;
		for(double i = 2; i < p.length; i++){
			if(p[(int)i] == 1){//ツ素ツ青板づーツ個ゥツづつつッツつスツづつォ
				//System.out.println(i);
				count[j] = (int)i + count[j-1];
				j++;
				for(double k = i; k*i < p.length; k++)
					p[(int)(i*k)] = 0;
			}
		}
		//System.out.println("j = "+j);
	}

}