// Itp1_4_c.java
import java.io.*;
import java.lang.Integer;
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
loop:		while(true) {
				String in  = br.readLine() ;
				String[] eq = in.split(" ");
				int[] nums = new int[2];
				nums[0] = Integer.parseInt(eq[0]);
				nums[1] = Integer.parseInt(eq[2]);
				switch(eq[1]) {
					case "+":
					System.out.println(nums[0]+nums[1]);
					break;
					case "-":
					System.out.println(nums[0]-nums[1]);
					break;
					case "*":
					System.out.println(nums[0]*nums[1]);
					break;
					case "/":
					System.out.println(nums[0]/nums[1]);
					break;
					default:
					break loop;
				}
			}
		} catch ( IOException e ) {
			System.out.println("??¨??????????????????????????????");
		}
	}
}