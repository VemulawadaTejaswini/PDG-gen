import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		if(360%input==0){
			System.out.println(360/input);
		}else{
			System.out.println(36.0/input);
		}
		

	}

}
