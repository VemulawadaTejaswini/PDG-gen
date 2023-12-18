import java.util.Scanner;
public class Main{
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		int S;
		S = sc.nextInt();
		
		System.out.println(((S-S%3600)/3600)+":"+((S-(S-S%3600)-(S%60))/60)+":"+(S%60));
	}
	public static void main(String[] args){
		Main obj = new Main();
		obj.solve();
	}
}