import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int[][] a = new int[2][2];
		for(int i = 0 ; i < 2 ; i++){
			a[0][i] = Integer.parseInt(sc.next());
			a[1][i] = 0;
			if(a[0][i] == 2) a[1][i] = 2;
			else if(a[0][i] == 4 || a[0][i] == 9 || a[0][i] == 6 || a[0][i] == 11) a[1][i] = 1;
		}
		if(a[1][0] == a[1][1]) ou.println("Yes");
		else ou.println("No");
		ou.flush();
	}
}