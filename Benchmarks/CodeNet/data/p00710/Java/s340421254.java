import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();

		while(sc.hasNextInt()){
			int value = sc.nextInt();
			int value2 = sc.nextInt();
			if(value == 0 && value2 == 0){
				break;
			}
			else{
				calc(value, value2);
			}
		}
	}
	public void calc(int n, int r){
		int[] cards = new int[r];
		ArrayList<Integer> pList = new ArrayList<Integer>();
		ArrayList<Integer> cList = new ArrayList<Integer>();
		for(int i = 0; i < r; i++){
			pList.add(0, sc.nextInt());
			cList.add(0, sc.nextInt());
		}
		int t = 1;
		for(int i = 0; i < r; i++){
			int p = pList.get(0);
			int c = cList.get(0);
			if(c >= t) t = p + t -1;
			else if((t-c) < p){
				t = t - c;
			}
			pList.remove(0);
			cList.remove(0);
		}
		System.out.println(n - t + 1);
	}
	public static void main(String[] args){
		new Main().run();
	}
}