import java.util.Scanner;

public class Main{
	int x;
	int ans;
	
	public void shori(){
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		ans = x*x*x;
		System.out.println(ans);
		sc.close();
	}
	public static void main(String[] args){
		Main obj =  new Main();
		obj.shori();
	}
}