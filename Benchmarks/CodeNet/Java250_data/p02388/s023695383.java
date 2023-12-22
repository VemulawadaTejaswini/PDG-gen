import java.util.Scanner;
public class Main{
	int X;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		X=sc.nextInt();
		System.out.println(X*X*X);
	
	}
	public static void main(String[] args){
		Main obj = new Main();
		obj.solve();
	}
}