import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String Sint;
		char Cint;
        int Int=0;
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		while(true) {
			Sint=sc.nextLine();
			if(Sint.equals("0"))
				break;
			for (int i = 0; i < Sint.length(); i++) {
				Cint=Sint.charAt(i);
				Int += Character.getNumericValue(Cint);
			}
					System.out.println(Int);
					Int=0;
		}
	}
}

