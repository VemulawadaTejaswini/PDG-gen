import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] arrInt = (new BufferedReader(new InputStreamReader(System.in))).readLine().split(" ");

		int w = Integer.parseInt(arrInt[0]);
		int h = Integer.parseInt(arrInt[1]);
		int x = Integer.parseInt(arrInt[2]);
		int y = Integer.parseInt(arrInt[3]);
		int r = Integer.parseInt(arrInt[4]);
		
		boolean isOut = false;
		//?????´??¢?¨????
		if(w - r < 0) isOut = true;	//width??????r?????§??????
		else if(x - r < 0) isOut = true;	//x-r??§??????????????????
		else if(y - r < 0) isOut = true;	//y-r??§??????????????????
		else if(x + r > w) isOut = true;	//x+r??§??????????????????
		else if(y + r > h) isOut = true;
		
		if(isOut) System.out.println("No");
		else System.out.println("Yes");
	}
}