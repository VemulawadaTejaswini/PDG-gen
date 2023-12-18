import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner  scan=new Scanner(System.in);
		int x=scan.nextInt();
		
		for(int i=1; i<8; i++){
			 x=scan.nextInt();
			System.out.println("Case "+ i+": "+x);
		}
		
	}

}

