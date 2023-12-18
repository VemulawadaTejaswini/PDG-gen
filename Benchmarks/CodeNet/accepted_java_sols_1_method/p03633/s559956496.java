import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		long yono = Long.parseLong(sc.next()) , a , aa , bb , pa;
		for(int i = 0 ; i < n - 1 ; i++){
			a = Long.parseLong(sc.next());
			aa = a;
			bb = yono;
			while(bb != 0){
				pa = aa % bb;
				aa = bb;
				bb = pa;
			}
			yono /= aa;
			yono *= a;
		}
		ou.println(yono);
		ou.flush();
    }
}