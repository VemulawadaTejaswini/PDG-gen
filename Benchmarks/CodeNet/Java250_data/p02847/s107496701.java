import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		if(S.equals("SUN")){
			System.out.println(7);
		}
		else if(S.equals("MON")){
			System.out.println(6);
		}
		else if(S.equals("TUE")){
			System.out.println(5);
		}
		else if(S.equals("WED")){
			System.out.println(4);
		}
		else if(S.equals("THU")){
			System.out.println(3);
		}
		else if(S.equals("FRI")){
			System.out.println(2);
		}
		else{
			System.out.println(1);
		}
		stdIn.close();
	}
}
