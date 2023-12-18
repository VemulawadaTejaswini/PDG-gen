import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		for(int i=1;;i++){
			Scanner sc=new Scanner(System.in);
			int x = sc.nextInt();
			if(x==0) break;
			System.out.println("Case "+ i +": "+ x);
		}
	}
}