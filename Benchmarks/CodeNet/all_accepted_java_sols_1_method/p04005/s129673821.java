import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] sides = new int[3];
		sides[0] = sc.nextInt();
		sides[1] = sc.nextInt();
		sides[2] = sc.nextInt();
		
		//check if even num
		if((sides[0]%2) == 0 || (sides[1]%2) == 0 || (sides[2]%2) == 0){
			System.out.println(0);
		}
		else{
			//all sides odd
			Arrays.sort(sides);
			long l = sides[0];
			l *= sides[1];
			System.out.println(l);
		}
	}
}