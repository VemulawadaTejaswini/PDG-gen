import java.util.Scanner;

public class Main{
	
	int h,m,s,S;
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		S = sc.nextInt();
	}
	
	public void hour(){
		if(S >=0 && S < 86400){
			h = S/3600;
		}
		else{
			System.out.print("error");
		}
	}
	
	public void minute(){
		if(S >=0 && S < 86400){
			m = (S-h*3600)/60;
		}
		else{
			System.out.print("error");
		}
	}
	
	public void second(){
		if(S >=0 && S < 86400){
			s = S-h*3600-m*60;
		}
		else{
			System.out.print("error");
		}
		System.out.println(h+":"+m+":"+s);
	}
	
	public static void main(String[] args){
		Main obj = new Main();
		obj.input();
		obj.hour();
		obj.minute();
		obj.second();
	}
}