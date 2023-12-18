import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = 0;
        
        for(int i=n;i<=m;i++){
        	if(i/10000==i%10)
        		if((i/1000)%10==(i%100)/10)
        			ans++;
        }
        
        System.out.println(ans);


        in.close();
    }
}
