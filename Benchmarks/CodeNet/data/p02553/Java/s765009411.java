import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        long a = scn.nextInt();
        long b = scn.nextInt();
        long c = scn.nextInt();
        long d = scn.nextInt();
        if(b>0 && d>0){
        	System.out.println(b*d);
        }else if(b<0 && d>0){
        	System.out.println(b*c);
        }else if(b>0 && d<0){
        	System.out.println(a*d);
        }else if(b<=0 && d<=0){
        	System.out.println(a*c);
        }
    }
}