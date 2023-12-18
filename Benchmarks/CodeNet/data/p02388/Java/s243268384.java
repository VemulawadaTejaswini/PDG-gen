import java.util.Scanner;
public class Main{
    int X;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		System.out.print(X*X*X);
		}
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}