
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		//long startTime = System.currentTimeMillis();
		
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		
		if(a1+a2+a3>=22){
			System.out.println("bust");
		}else{
			System.out.println("win");
		}
		
	}
}
