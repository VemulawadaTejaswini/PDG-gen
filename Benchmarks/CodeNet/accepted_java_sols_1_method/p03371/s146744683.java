import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		sc.close();
		if(a + b <= 2 * c){
			ou.print(a * x + b * y + "\n");
		}else{
			if(x < y) ou.print(Math.min(x * c * 2 + (y - x) * b , Math.max(x , y) * 2 * c) + "\n");
			else ou.print(Math.min(y * c * 2 + (x - y) * a , Math.max(x , y) * 2 * c) + "\n");
		}
		ou.flush();
    }
}