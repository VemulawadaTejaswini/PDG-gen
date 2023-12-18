import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		int[] s = new int[h * w];
		int cou = 0 , a , co = 1;
		for(int i = 0 ; i < n ; i++){
			a = Integer.parseInt(sc.next());
			for(int j = 0 ; j < a ; j++){
				s[cou + j] = co;
			}
			cou += a;
			co++;
		}
		sc.close();
		for(int i = 0 ; i < h ; i++){
			if(i % 2 == 0){
				for(int j = 0 ; j < w ; j++){
					ou.print(s[i * w + j]);
					if(j != w - 1) ou.print(" ");
				}
			}else{
				for(int j = w - 1 ; j >= 0 ; j--){
					ou.print(s[i * w + j]);
					if(j != 0) ou.print(" ");
				}
			}
			ou.print("\n");
		}
		ou.flush();
    }
}