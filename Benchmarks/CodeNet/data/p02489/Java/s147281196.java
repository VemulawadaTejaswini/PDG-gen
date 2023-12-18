import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		int i=0,x;
		while(true){
			Scanner sc = new Scanner(System.in);
			x=sc.nextInt();
			if(x == 0) break;
			i++;
			System.out.println("Case "+i+": "+x);
		}
	}

}