import java.util.Scanner;
public class Main {
	int d;
	public void solve() {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int s=a;
	d=1;
while(true) {
	a+=s;
	 d=d+1;
	// System.out.println(d);
	 if(a==360) {
		 break;
	 }else if(a>360) {
		d= d-1;
		 break;
	 }
}

System.out.println(d);
}


	public static void main(String[] args) {
		new Main().solve();
	
	}
}
