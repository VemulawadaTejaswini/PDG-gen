import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int a = Integer.parseInt(sc.next());
		if(sc.next().equals("+")) ou.println(a + Integer.parseInt(sc.next()));
		else ou.println(a - Integer.parseInt(sc.next()));
		ou.flush();
	}
}