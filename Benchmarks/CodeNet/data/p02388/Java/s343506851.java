import java.util.Scanner;
public class Main5{
    int X;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		System.out.print(X*X*X);
		}
    public static void main(String[] args){
        Main5 obj = new Main5();
        obj.solve();
    }
}