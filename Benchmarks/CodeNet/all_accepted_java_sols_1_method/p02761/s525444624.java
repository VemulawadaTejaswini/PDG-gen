import java.math.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N =  sc.nextInt();
	    int M =  sc.nextInt();
	    int[] z = new int[N];
	    for (int i = 0; i < M; i++){
            int s = sc.nextInt();
            int c = sc.nextInt();
        if ((z[s-1] != 0 && z[s-1] != c) || (N >= 2 && s == 1 && c == 0)){
            System.out.println(-1);
            return;
        }
        z[s-1] = c;
	    }
	    if (N >= 2 && z[0] == 0){
            z[0] = 1;
        }
	    for (int i = 0; i < z.length; i++){
            System.out.print(z[i]);
        }
    }
}
