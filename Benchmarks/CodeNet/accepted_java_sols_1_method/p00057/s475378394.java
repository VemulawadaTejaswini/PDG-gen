import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	int n = 0;
    	
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){
    	n = scan.nextInt();
    	int num = n * (n+1)/2+1;
    	System.out.println(num);
    	}
    	
    	}
 }