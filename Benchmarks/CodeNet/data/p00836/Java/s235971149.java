import java.util.*;
import java.awt.geom.*;
public class Main {
	//0945 start
	//0952 WA
	ArrayList<Integer> list;
	int MAX = 10000;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		eratos();
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int count = 0;
			int len = list.size();
			for(int i = 0; i < len; i++){
				int sum = list.get(i);
				if(sum == n){
					count++;
				}
				for(int j = i + 1; j < len; j++){
					sum += list.get(j);
					if(sum == n){
						count++;
						break;
					}
					if(sum > n ){
						break;
					}
				}
			}
			System.out.println(count);
		}
	}

	private void eratos() {
		boolean [] isprime = new boolean[MAX + 1];
		Arrays.fill(isprime, true);
		isprime[0] = false;
		isprime[1] = false;
		list = new ArrayList<Integer>();
		for(int i = 2;i<= MAX; i++){
			if(isprime[i]){
				list.add(i);
				for(int j = i + i; j <= MAX; j+= i){
					isprime[j] = false;
				}
			}
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}