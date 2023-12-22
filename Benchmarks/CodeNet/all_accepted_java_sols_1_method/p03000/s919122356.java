
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();

		int c = 0;
		try {

			int h = in.nextInt();
			while(h <= x) {
				h += in.nextInt();
				c++;
			}
		}catch (NoSuchElementException e){
			c++;
		}
		System.out.println(c+1);
	}

}
