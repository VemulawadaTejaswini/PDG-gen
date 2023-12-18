//package project1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Test{ 
    public static void main(String[] args) throws Exception{
       // Scanner sc = new Scanner(System.in);
    	 InputStreamReader r=new InputStreamReader(System.in);    
    	    BufferedReader sc=new BufferedReader(r);      
        String s= sc.readLine();
        int n = Integer.parseInt(s);
        int res = (n-(n%1000))%1000;
        System.out.println(res);
        }
    }