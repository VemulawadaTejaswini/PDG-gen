import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	int kotae = 0;
    	for(int i = 1; i <= 9; i++){
    		for (int k = 1; k <= 9; k++){
    			kotae = i*k;
    			System.out.println(i + "x" + k + "=" + kotae);
    		}
    		
    	}

    }
}