import java.util.Scanner;
public class Main{
	int x,y;
	public void solve(){
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
		y=x*x*x;
		System.out.println(y);
		System.out.println();
	}
	public static void main(String[] args){
		Main obj=new Main();
		obj.solve();
	}
}