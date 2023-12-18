import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		for(int i = 0 ; i<10000 ; i++){
			int a=scan.nextInt();
			if(a==0) break;
		System.out.println("case "+(i+1)+": "+a);
		}
	}


}