import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int[] p = new int[N];
        boolean[] q = new boolean[101];
        for(int i=0; i<N; i++){
            p[i]=sc.nextInt();
            q[p[i]] = true;
        }

        int res=X;
        for(int i=0; i<N; i++){
            if(!q[X-i]){
                res=X-i;
                break;
            }
            if(!q[X+i]){
                res=X+i;
                break;
            }
        }
        
         System.out.println(res);
        
    
        }
    }