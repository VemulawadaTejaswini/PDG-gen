import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc;
	public void exe(String x){
		int sum = 0;
		for(int i = 0; i < x.length(); i++){
			char c = x.charAt(i);
			int n = Integer.parseInt("" + c);
			sum = sum + n;
		}
		System.out.println(sum);
	}
	public void run(){
		sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			String value = sc.next();
			if(value.equals("0")){
				break;
			}
			else{
				exe(value);
			}
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}