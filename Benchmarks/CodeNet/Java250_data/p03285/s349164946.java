import java.util.Scanner;
 
class Main {
	int n;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
	}
	void solve(){
		boolean ans = false;
		flag:for(int i=0;i*4<=n;i++){
			for(int j=0;j*7<=n;j++){
				if(i*4+j*7==n){
					ans = true;
					break flag;
				}
			}
		}
		if(ans){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}