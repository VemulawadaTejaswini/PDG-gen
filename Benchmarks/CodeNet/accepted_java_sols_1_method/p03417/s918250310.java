import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long m = in.nextInt();
        long ans = 0;
        
        if(n==2 || m==2){
        	ans = 0;
        }else if(n==1||m==1){
        	if(n==1&&m==1)
        		ans=1;
        	else
        		ans =n*m-2;
        }else{
        	ans = (n-2)*(m-2);
        }
        
        System.out.println(ans);


        in.close();
    }
}
