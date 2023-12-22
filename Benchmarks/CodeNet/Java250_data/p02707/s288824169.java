import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] q = new int[n];
		Arrays.fill(q , 0);
		for(int i = 1 ; i < n ; i++){
			q[Integer.parseInt(sc.next()) - 1]++;
		}
		sc.close();
		for(int i = 0 ; i < n ; i++){
			ou.print(q[i] + "\n");
		}
		ou.flush();
	}
}