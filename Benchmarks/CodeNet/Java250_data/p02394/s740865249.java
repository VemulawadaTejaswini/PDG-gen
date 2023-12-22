import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intW = scan.nextInt();
		int intH = scan.nextInt();
		int intX = scan.nextInt();
		int intY = scan.nextInt();
		int intR = scan.nextInt();
		if(intX <= intW - intR && intR <= intX && intY <= intH - intR && intR <= intY){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}