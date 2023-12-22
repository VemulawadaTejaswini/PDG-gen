import java.util.*;
import java.math.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int w = in.nextInt();
		if(s>w){
			System.out.println("safe");
		}else{
			System.out.println("unsafe");		
		}
	}
}