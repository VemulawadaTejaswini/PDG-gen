import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		for(int i = 0 ; i < 3 ; i++) ou.print((char)(sc.next().charAt(0) - 32));
		ou.println();
		ou.flush();
	}
}