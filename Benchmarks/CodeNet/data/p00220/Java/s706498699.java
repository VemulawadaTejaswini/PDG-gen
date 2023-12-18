import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			double x = sc.nextDouble();
			if(x == -1) break;

			int left = (int)x;
			String leftS = Integer.toString(left,2);

			if(leftS.length() > 8){
				System.out.println("NA");
				continue;
			}

			double right = x % 1;
			String rightS = "";
			int rem = 4;

			while(rem-- > 0 && right != 0){
				right *= 2;
				rightS += (int)right;
				right %= 1;
			}

			if(right != 0){
				System.out.println("NA");
				continue;
			}

			while(leftS.length() != 8) leftS = "0" + leftS;
			while(rightS.length() != 4) rightS += "0";

			System.out.println(leftS + "." + rightS);
		}
	}
}