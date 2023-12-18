import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);// TODO Auto-generated method stub
		String alfa=input.next();
		if(alfa.equals(alfa.toLowerCase())) {
			System.out.println("a");
		}
		else {
			System.out.println("A");
		}
	}

}