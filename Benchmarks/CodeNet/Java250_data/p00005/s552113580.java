import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	static int getGCD(int a,int b){
		if(b>a){
			int tmp=a;
			a=b;
			b=tmp;
		}
		while(b!=0){
			int tmp=b;
			b=a%b;
			a=tmp;
		}
		return a;
	}
	static int getLCM(int a,int b){
		return a/getGCD(a,b)*b;
	}
	public static void main(String[] args){
		sc=new Scanner(System.in);
		while(true){
			try{
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.print(getGCD(a,b)+" ");
				System.out.println(getLCM(a,b));
			}catch(NoSuchElementException e){
				break;
			}
		}
	}

}