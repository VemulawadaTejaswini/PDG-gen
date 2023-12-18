import java.util.Scanner;

public class Main{
	
	int tate;
	int yoko;
	
	public void solve(){
		Scanner sc=new Scanner(System.in);
		tate = sc.nextInt();
		yoko = sc.nextInt();
		
		int men=tate*yoko;
		int syu=(tate+yoko)*2;
		
		System.out.println(men+" "+syu);
	}
	
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}