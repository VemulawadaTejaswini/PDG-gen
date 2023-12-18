// Itp1_6_a.java
import java.io.*;
import java.lang.Integer;
public class Main
{
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int length = Integer.parseInt(br.readLine());
			String[] nums = (br.readLine()).split(" ");
			for( int i = length-1 ; i >= 0 ; i-- ) {
				if ( i != 0 ) {
					System.out.print(nums[i] + " ");
				} else {
					System.out.println(nums[i]);
				}
			}
		} catch ( IOException e ) {
			System.out.println("??¨??????????????????????????????");
		}
	}
}