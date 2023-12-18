import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] q = new int[n];
		int[] che = new int[n];
		Arrays.fill(che , 0);
		Arrays.fill(q , (int)Math.pow(10 , 8));
		int a = 0 , b = 0;
		int cou = 0;
		for(int i = 0 ; i < m ; i++){
			a = Integer.parseInt(sc.next()) - 1;
			b = Integer.parseInt(sc.next()) - 1;
			if(q[a] == (int)Math.pow(10 , 8) && q[b] == (int)Math.pow(10 , 8)){
				che[cou] += 2;
				q[a] = cou;
				q[b] = cou;
				cou++;
			}else if(q[a] != (int)Math.pow(10 , 8) && q[b] == (int)Math.pow(10 , 8)){
				che[q[a]]++;
				q[b] = q[a];
			}else if(q[b] != (int)Math.pow(10 , 8) && q[a] == (int)Math.pow(10 , 8)){
				che[q[b]]++;
				q[a] = q[b];
			}else if(q[a] != q[b]){
				for(int ii = 0 ; ii < n ; ii++){
					if(che[ii] == che[q[b]]){
						che[ii] = a;
					}
				}
				che[q[a]] += che[q[b]];
				che[q[b]] = 0;
			}
		}
		int yono = 1;
		for(int i = 0 ; i < cou ; i++){
			yono = Math.max(yono , che[i]);
		}
		ou.print(yono + "\n");
		ou.flush();
    }
}