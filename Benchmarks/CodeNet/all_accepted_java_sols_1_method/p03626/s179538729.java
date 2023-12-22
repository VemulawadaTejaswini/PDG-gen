import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		char[][] q = new char[2][n];
		for(int i = 0 ; i < 2 ; i++){
			String s = sc.next();
			for(int j = 0 ; j < n ; j++){
				q[i][j] = s.charAt(j);
			}
		}
		long yono = 0;
		for(int i = 0 ; i < n ; i++){
			if(i == 0){
				if(q[0][0] == q[1][0]) yono = 3;
				else{
					i++;
					yono = 6;
				}
			}else{
				if(q[0][i] == q[1][i] && q[0][i - 1] == q[1][i - 1]) yono *= 2;
				else if(q[0][i] != q[1][i]){
					if(q[0][i - 1] == q[1][i - 1]) yono *= 2;
					else yono *= 3;
					i++;
				}
				yono %= 1000000007;
			}
		}
		ou.println(yono);
		ou.flush();
	}
}