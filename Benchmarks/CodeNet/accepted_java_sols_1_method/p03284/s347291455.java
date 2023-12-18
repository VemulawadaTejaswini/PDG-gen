import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int i = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		sc.close();
		int aa = 0;
		if(i % a != 0) aa++;
		ou.println(aa);
		ou.flush();
	}
}