import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int l = Integer.parseInt(sc.next());
		int r = Integer.parseInt(sc.next());
		sc.close();
		r -= l;
		l %= 2019;
		r += l;
		int yono = 2019;
		if(r - l > 2019){
			yono = 0;
		}else{
			for(int i = l ; i <= r ; i++){
				for(int j = l ; j < i ; j++){
					yono = Math.min(yono , (i * j) % 2019);
				}
			}
		}
		ou.print(yono + "\n");
		ou.flush();
    }
}