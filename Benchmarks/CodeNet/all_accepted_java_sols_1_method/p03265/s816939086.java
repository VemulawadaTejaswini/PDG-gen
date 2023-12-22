import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int a = Integer.parseInt(sc.next()) , b = Integer.parseInt(sc.next()) , c = Integer.parseInt(sc.next()) , d = Integer.parseInt(sc.next()) , e = b + c - d , f = - a + c + d;
		ou.print(e + " " + f + " ");
		a = c; b = d; c = e; d = f; e = b + c - d; f = - a + c + d;
		ou.println(e + " " + f);
		sc.close();
		ou.flush();
	}
}