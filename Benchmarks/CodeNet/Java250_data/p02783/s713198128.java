import java.util.Scanner;

public class Main{

    public static void main(String args[]){
		solve();
    }
	
	private static void solve(){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		if(H%A == 0){
			System.out.println(H/A);
		}else{
			System.out.println(H/A + 1);
		}
	}
}