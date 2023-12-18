import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		int X = input.nextInt();
		int Y = input.nextInt();
		boolean good = false;
		for (int crane = 0; crane <= X; crane++) {
			if (crane*2+(X-crane)*4==Y) {
				good=true;
				break;
			}
		}
		System.out.println(good?"Yes":"No");
	}	
}