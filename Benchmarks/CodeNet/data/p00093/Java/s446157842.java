import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	int firstyear = 0;
    	int lastyear = 0;
    	Scanner scan = new Scanner(System.in);
    	 while(true){
    	firstyear = scan.nextInt();
    	lastyear = scan.nextInt();
    	Boolean have = false;
    	if(firstyear == 0 && lastyear == 0){
    		break;
    	}
    	for (int i = firstyear; i <= lastyear; i++){
    			if(i%400 == 0|| (i%4 == 0 && i % 100 != 0)){
    				System.out.println(i);
    				have = true;
    			}
    		
    	}
    	if (have == false){
    		System.out.println("NA");
    	}
    	
    }
    }
    
}