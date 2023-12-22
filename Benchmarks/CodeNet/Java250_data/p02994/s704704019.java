
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int ans = 20000;
        int counter = 0;

        for(int i=1;i<=n;i++){
        	counter += l + i - 1;
        }

        for(int i=1;i<=n;i++){
        	int count = 0;
        	for(int j=1;j<=n;j++){
        		if(i == j){
        			continue;
        		}
        		count += l + j - 1;
        	}
        	
        	if(Math.abs(Math.abs(counter) - Math.abs(ans)) > Math.abs(Math.abs(counter) - Math.abs(count))){
        		ans = count;
        	}
        }

        System.out.println(ans);
    }
}