import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext())System.out.println((Integer.toString(scan.nextInt()+scan.nextInt())).length());
	}
}