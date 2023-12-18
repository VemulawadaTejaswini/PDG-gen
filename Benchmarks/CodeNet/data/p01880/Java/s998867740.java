import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		int n = sc.nextInt();
		calc(n);
	}
	public void calc(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		
		int max = -1;
		
		for(int i = n -1; i >= 0; i--){
			for(int j = i-1; j >= 0; j--){
				int pro = list.get(i) * list.get(j);
				if(pro < max) break;
				else if(pro > max && check(pro/10, pro%10) == 1) {
					max = pro;
				}
			}
		}
		System.out.println(max);
	}
	
	public int check(int p, int b){
		if (p == 0) return 1;
		
		int nb = p % 10;
		int np = p / 10;
		if(nb == b-1){
			return check(np, nb);
		}
		else return 0;
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}