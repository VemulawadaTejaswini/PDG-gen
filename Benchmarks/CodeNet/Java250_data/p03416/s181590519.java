import java.util.Scanner;
 
class Main {
	int a;
	int b;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		a = sc.nextInt();
		b = sc.nextInt();
	}
	void solve(){
		int cnt = 0;
		for(int i=a;i<=b;i++){
			if(i/10000==i%10){
				if((i/1000)%10==(i%100)/10){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}