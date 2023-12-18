import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int min = (int)Math.pow(10 , 9);
		long sum = 0;
		int a;
		for(int i = 0 ; i < n ; i++){
			a = Integer.parseInt(sc.next());
			sum += a;
			min = Math.min(a , min);
		}
		sc.close();
		sum -= min;
		ou.println(sum);
		ou.flush();
	}
}