import java.util.HashSet;
import java.util.Scanner;
 
class Main {
	int n;
	HashSet<Integer> d;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		d = new HashSet<Integer>();
		for(int i=0;i<n;i++){
			d.add(sc.nextInt());
		}
	}
	void solve(){
		System.out.println(d.size());
	}
}