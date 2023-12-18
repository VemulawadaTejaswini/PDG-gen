import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		int s,w;
		s=input.nextInt();
		w=input.nextInt();
		if(w>=s)
		    System.out.println("unsafe");
		 else
		  System.out.println("safe");
		input.close();
	}
}