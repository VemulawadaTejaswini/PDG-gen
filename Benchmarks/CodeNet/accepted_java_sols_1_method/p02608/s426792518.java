import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		sc.close();
		int[] yono = new int[n];
		Arrays.fill(yono , 0);
		for(int a = 1 ; a <= Math.sqrt(n) ; a++){
			for(int b = 1 ; b <= Math.sqrt(n) ; b++){
				for(int c = 1 ; c <= Math.sqrt(n) ; c++){
					if(a * a + b * b + c * c + a * b + b * c + c * a <= n){
						yono[a * a + b * b + c * c + a * b + b * c + c * a - 1]++;
					}
				}
			}
		}
		for(int i = 0 ; i < n ; i++) ou.println(yono[i]);
		ou.flush();
	}
}