import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        for(int n=0;n<N;n++) p[n]=sc.nextInt()-1; //to 0-indexed
        
        int ans = 0;
        int t=0;
        //the best plan: if the i-th element is i, swap it with the next one. otherwise do nothing.
        for(int n=0;n<N-1;n++){
        	if(p[n]==n){
        	    t=p[n];
        	    p[n]=p[n+1];
        	    p[n+1]=t;
        	    ans++;
        	}
        }
        //the final elements does not have the next one...
        if(p[N-1]==N-1)ans++;
        System.out.println(ans);
    }
}