
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while(true){
        	if((n+i)%111==0){
        		System.out.println(n+i);
        		break;
        	}
        	i++;
        }
    }
}