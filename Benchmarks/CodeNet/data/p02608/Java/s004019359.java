import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		sc.close();
		for(int i = 1 ; i <= n ; i++){
			int yono = 0;
			for(int a = 1 ; a <= Math.sqrt(n) ; a++){
				for(int b = 1 ; b <= Math.sqrt(n) ; b++){
					for(int c = 1 ; c <= Math.sqrt(n) ; c++){
						if(i == a * a + b * b + c * c + a * b + b * c + c * a) yono++;
					}
				}
			}
			ou.println(yono);
		}
		ou.flush();
	}
}