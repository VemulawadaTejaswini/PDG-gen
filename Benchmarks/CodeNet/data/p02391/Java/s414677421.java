import java.util.Scanner;
public class Main{
    
    public void solve(){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int h = sc.nextInt();
		int a,b;
		if(t<h){
			System.out.println("a < b");
		}else if(t>h){
			System.out.println("a > b");
		}else if(t==h){
			System.out.println("a == b");
		}
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}