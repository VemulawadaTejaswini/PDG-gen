import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, sum; String xst;
		
		while(true){
			xst = ""; sum = 0;
			x = in.nextInt();
			if(x==0) break;
			
			xst = String.valueOf(x);
			for(int i=0;i<xst.length();i++)
				sum += Integer.parseInt(String.valueOf(xst.charAt(i)));
			
			System.out.println(sum);
		}
	}
}