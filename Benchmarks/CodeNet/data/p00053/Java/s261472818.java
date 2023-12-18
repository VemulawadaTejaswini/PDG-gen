import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, ans;
	static int p[];
	static int[] count = new int[10000];
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
		System.out.println(count[n]);
	}
	static void Prime(int a){
		p = new int[10000+1];
		int j = 1;
		count[0] = 0;
		for(int i = 0; i <= 10000; i++)
			p[i] = 1;
		for(int i = 2; i <= 10000; i++){
			if(p[i] == 1){//ツ素ツ青板づーツ個ゥツづつつッツつスツづつォ
				//System.out.println(i);
				count[j] = i + count[j-1];
				j++;
				for(int k = i; k*i <= 10000; k++)
					p[i*k] = 0;
			}
		}
	}

}