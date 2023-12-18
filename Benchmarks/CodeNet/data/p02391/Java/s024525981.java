import java.util.Scanner;
public class Main{
	int a,b;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a<b){
			System.out.print("a < b");
		}if(a>b){
			System.out.print("a > b");
		}if(a==b){
			System.out.print("a == b");
		}
	}
		
    public static void main(String args[]){
        Main obj = new Main();
        obj.solve();
    }
}