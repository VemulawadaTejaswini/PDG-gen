
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);




	public static void main(String[] args) throws Exception {

		//setOut();
		int n = sc.nextInt();
		Long res=(long) 1;
		Long odd=(long)1;
		for (int i = 1; i <= n; i++) {
			int k=sc.nextInt();
			res*=3;
			if(k%2==0)
				odd*=2;
	
		}
		System.out.println(res-odd);

	}


}