import java.io.*;
import java.util.*;

public class Main {
    public static int MAXN = 1600;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n=cin.nextInt();
        if(n<10){
        	out.println("Yes");
        }else if(n>=10&&n<100){
        	if((n%10)==(n/10)){
        		out.println("Yes");
        	}else{
        		out.println("No");
        	}
        }else{
        	if((n%10)==(n/100)){
        		out.println("Yes");
        	}else{
        		out.println("No");
        	}
        }
        out.flush();
        out.close();
        cin.close();
    }
}