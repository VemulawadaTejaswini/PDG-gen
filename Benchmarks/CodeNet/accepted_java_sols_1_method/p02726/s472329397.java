import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next()) - 1;
		int y = Integer.parseInt(sc.next()) - 1;
		sc.close();
		long[] k = new long[n - 1];
		Arrays.fill(k , 0);
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < i ; j++){
				k[Math.min(i - j - 1 , Math.abs(j - x) + Math.abs(i - y))]++;
			}
		}
		for(int i = 0 ; i < n - 1 ; i++) ou.print(k[i] + "\n");
		ou.flush();
    }
}