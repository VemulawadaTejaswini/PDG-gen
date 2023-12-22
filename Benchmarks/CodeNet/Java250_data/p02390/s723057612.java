import java.util.Scanner;
public class Main{
	int S,h,m,s;
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		S = sc.nextInt();
		h = S/3600%60;
		m = S/60%60;
		s = S%60;
		
		System.out.print(h+":"+m+":"+s);
		System.out.println();
	}
		
    public static void main(String args[]){
        Main obj = new Main();
        obj.solve();
    }
}