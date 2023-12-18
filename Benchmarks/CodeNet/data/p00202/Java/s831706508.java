import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static int num, charge;
	static int dish[] = new int[30];
	
	public static void main(String[] args) {

		while(read()){
			solve();
		}
		
	}
	
	//readÖ
	static boolean read(){
		if(sc.hasNextInt()){
			num = sc.nextInt();
			charge = sc.nextInt();
			if(num == 0 && charge == 0)  return false;
			
			for(int i=0; i<num; i++){
				dish[i] = sc.nextInt();
			}
		}
		return true;
	}
	
	//solveÖ
	static void solve(){
		Queue<Integer> que1 = new LinkedList<Integer>();
		
		for(int i=2; i<charge; i++){
			que1.add(i);
		}
		

		for(int i=0; i<num; i++){
			for(int j=dish[i]; j<charge; j+=dish[i]){
				if(que1.contains(j)){
					((LinkedList<Integer>) que1).get(((LinkedList<Integer>) que1).indexOf(j));
				}
			}
		}
		
		if(que1.isEmpty() == false){	
			System.out.println(((LinkedList<Integer>) que1).getLast());
			return;
		}
		
		//¦Èµ
		System.out.println("NA");
/*
		for(int j=0; j<num; j++){
			for(int k=dish[j]; k<charge; k+=dish[j]){
				for(int i=0; i<que1.size(); i++){
					int n = que1.poll();
					if(n != k){
						que1.add(n);
					}
				}
			}
		}
		
		int ans = 0;
		while(que1.isEmpty() == false){
			ans = que1.poll();
		}
		
		System.out.println(ans);
		
		*/
		
	}

}