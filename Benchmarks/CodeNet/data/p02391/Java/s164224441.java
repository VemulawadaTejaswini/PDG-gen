import java.util.Scanner;
public class Main{
    int A,B;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		if(A<B){
			System.out.print("a<b");
		}else{
			if(A>B){
				System.out.print("a>b");
			}else{
					System.out.print("a==b");
			}
		}
	}
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}