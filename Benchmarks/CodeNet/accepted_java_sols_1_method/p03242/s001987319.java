import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char a[] = sc.nextLine().toCharArray();
		for(int i = 0;i<a.length; i++) {
			if(a[i] == '9') a[i] = '1'; 
			else a[i] = '9';
		}
		System.out.println(a);
	}
}