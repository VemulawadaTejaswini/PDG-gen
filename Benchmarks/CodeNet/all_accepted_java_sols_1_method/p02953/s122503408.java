import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] h = new int[n];
		for(int i = 0 ; i < n ; i++){
			h[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		for(int i = n - 2 ; i >= 0 ; i--){
			if(h[i] > h[i + 1]) h[i]--;
		}
		boolean ebishu = true;
		for(int i = 1 ; ebishu && i < n ; i++){
			if(h[i - 1] > h[i]) ebishu = false;
		}
		if(ebishu) ou.print("Yes\n");
		else ou.print("No\n");
		ou.flush();
    }
}