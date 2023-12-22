import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = Integer.parseInt(sc.next());
		sc.close();
		boolean check = true;
		int yono = 0;
		while(check){
			int cou = 0;
			for(int i = 0 ; i < n ; i++){
				if(a[i] != 0){
					cou++;
					a[i]--;
				}else{
					if(cou != 0) yono++;
					cou = 0;
				}
			}
			if(cou != 0) yono++;
			boolean ch = true;
			for(int i = 0 ; i < n && ch ; i++){
				if(a[i] != 0) ch = false;
			}
			if(ch) check = false;
		}
		ou.print(yono + "\n");
		ou.flush();
    }
}