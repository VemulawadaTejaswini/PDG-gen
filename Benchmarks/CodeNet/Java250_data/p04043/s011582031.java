import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args)  {
	Scanner in = new Scanner(System.in);
	    int [] a = new int[3];
	    for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}Arrays.sort(a);
		if((a[0]== 5 && a[1] == 5&& a[2] == 7 )) {
			System.out.println("YES");
		}else System.out.println("NO");
	}
	
}

