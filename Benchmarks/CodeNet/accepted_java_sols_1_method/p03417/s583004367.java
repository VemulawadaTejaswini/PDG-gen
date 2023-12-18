import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		long N = in.nextLong();
		long M = in.nextLong();
		long ans = (N - 2) * (M - 2);
		if(N == 1 && M >= 3) ans = M - 2;
		if(M == 1 && N >= 3) ans = N - 2;
		if(M == 1 && N == 1) ans = 1;
		System.out.println(ans);
	}
}
