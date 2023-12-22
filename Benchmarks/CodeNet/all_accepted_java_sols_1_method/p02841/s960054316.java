import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int a = 0;
		for(int i = 0 ; i < 4 ; i++) a = Integer.parseInt(sc.next());
		if(a == 1) ou.println(1);
		else ou.println(0);
		ou.flush();
	}
}