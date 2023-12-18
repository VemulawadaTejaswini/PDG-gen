import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String W = sc.nextLine();
		int num = 0;
		for(;;){
			String T = sc.next();
			if(T.equals("END_OF_TEXT"))break;
			if(W.equals(T))num++;
		}
		System.out.println(num);
	}	
}