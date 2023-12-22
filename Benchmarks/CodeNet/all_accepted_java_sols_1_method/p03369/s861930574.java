import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int count = 0;
		for(int i = 0;i<a.length(); i++) {
			if(a.charAt(i) == 'o') count++;
		}
		System.out.println(700 + (100*count)); 
	}
}