import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			ans = -1;
			flag = 0;
			t = sc.nextInt();
			int num = sc.nextInt();
			if(t == 0 && num == 0)break;
			else calc(t, Integer.toString(num));
			
		}
	}
	
	int t = 0;
	ArrayList<Integer> anslist;
	int ans = -1;
	int flag = 0;
	public void calc(int t, String num){
		for(int i = 0; i < num.length(); i++){
			calc2(num, i, 0, new ArrayList<Integer>());
		}
		if(ans == -1) System.out.println("error");
		else if(flag == 1) System.out.println("rejected");
		else {
			System.out.print(ans);
			int k = 0;
			for(int i = 0; i < anslist.size(); i++){
				System.out.print(" " + num.substring(k, k + anslist.get(i)));
				k = k + anslist.get(i);
			}
			System.out.println();
		}
	}
	
	public void calc2(String num, int i, int sum, ArrayList<Integer> list){
		if(i == 0){
			sum += Integer.parseInt(num);
			list.add(num.length());
			if(sum <= t && sum > ans) {
				ans = sum;
				anslist = list;
				flag = 0;
			}
			else if(sum == ans) flag = 1;
		}
		else{
			for(int k = 1; k < num.length() - i + 1; k++){
				ArrayList<Integer> l = new ArrayList<Integer>();
				for(int t = 0; t < list.size(); t++){
					l.add(t, list.get(t));
				}
				l.add(k);
				String next = num.substring(k);
				
				calc2(num.substring(k), i - 1, sum + Integer.parseInt(num.substring(0, k)), l);
				
			}
		}
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}