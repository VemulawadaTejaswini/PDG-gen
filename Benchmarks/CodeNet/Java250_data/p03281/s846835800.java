import java.util.*;
import java.io.*;

public class Main {
    public static int count(int k){
        int ans = 0;
        for(int i=1;i*i<=k;i++){
        	if(k%i==0){
        	    if(i*i==k) ans+=1;
        	    else ans+=2;
        	}
        }
        return ans;
    }
    public static int solve(int N){
        int ans = 0;
        for(int i=1;i<=N;i++){
        	if(i%2!=0 && count(i)==8)ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solve(N));
    }
}
