import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int[][] s = new int[h + 2][w + 2];
		for(int i = 0 ; i < h + 2 ; i++) Arrays.fill(s[i] , 0);
		for(int i = 0 ; i < h ; i++){
			String sss = sc.next();
			for(int j = 0 ; j < w ; j++){
				if(sss.charAt(j) == '#') s[i + 1][j + 1] = -1;
			}
		}
		sc.close();
		for(int i = 1 ; i < h + 1 ; i++){
			for(int j = 1 ; j < w + 1 ; j++){
				if(s[i][j] != -1){
					for(int pp = i - 1 ; pp <= i + 1 ; pp++){
						for(int qq = j - 1 ; qq <= j + 1 ; qq++){
							if(s[pp][qq] == -1) s[i][j]++;
						}
					}
				}
			}
		}
		for(int i = 1 ; i < h + 1 ; i++){
			for(int j = 1 ; j < w + 1 ; j++){
				if(s[i][j] == -1) ou.print("#");
				else ou.print(s[i][j]);
			}
			ou.println();
		}
		ou.flush();
	}
}