import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
	int M=sc.nextInt();
        int h[]=new int[M];
	int w[]=new int[M];
	
	int h1[]=new int[300001];
	int w1[]=new int[300001];
        for(int i=0; i<M; i++){
	    h[i]=sc.nextInt();
	    h1[h[i]]++;
	    w[i]=sc.nextInt();
	    w1[w[i]]++;
	}
    }
}

