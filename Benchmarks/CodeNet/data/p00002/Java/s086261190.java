import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()){
			int a =scan.nextInt();
			int b =scan.nextInt();
			System.out.println((Integer.toString(a+b)).length());
		}
	}
}