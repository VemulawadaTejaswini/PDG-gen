import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	String n = "";
    	String at = "@";
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){
    	n = scan.next();

    	String  after = "";
    	for (int i = 0;i < n.length();i++){
    		if(n.charAt(i) == '@'){
    			for(int k = 0;k < Integer.parseInt(String.valueOf(n.charAt(i+1)));k++){
    				after += n.charAt(i + 2);
    			}
    			i = i + 2;
    		}else{
    			after += n.charAt(i);
    		}
    	}
    	System.out.println(after);
    	}
    	
    	}
 }