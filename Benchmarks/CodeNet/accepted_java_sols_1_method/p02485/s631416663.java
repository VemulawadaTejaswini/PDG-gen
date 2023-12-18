import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum; String xst;
		
		while(true){
			sum = 0;
			xst = String.valueOf(in.nextLine());
			if(xst.equals(String.valueOf(0))) break;
			
			for(int i=0;i<xst.length();i++)
				sum += Integer.parseInt(String.valueOf(xst.charAt(i)));
			
			System.out.println(sum);
		}
	}
}