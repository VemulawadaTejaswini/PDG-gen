import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	Scanner sc;
	
	public void execution(int m, int f, int r){
		if(m == -1 || f == -1) System.out.println("F");
		else if (m + f >= 80) System.out.println("A");
		else if (m + f >= 65) System.out.println("B");
		else if (m + f >= 50) System.out.println("C");
		else if (m + f >= 30){
			if(r >= 50) System.out.println("C");
			else System.out.println("D");
		}
		else System.out.println("F");
	}
	public void run(){
		sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if(m == -1 && f == -1 && r == -1){
				break;
			}
			else{
				execution(m,f,r);
			}
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}