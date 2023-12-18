import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char ch = scn.next().charAt(0);
		if(ch>=65 && ch<=91){
			System.out.println("A");
		}else{
			System.out.println('a');
		}
				

	}

}