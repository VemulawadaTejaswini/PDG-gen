import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a) throws Exception{
    	int x = 0;
    	int S = 0;
    	int h = 0;
    	int shikaku = 0;
    	int sankaku = 0;
    	Scanner scan = new Scanner(System.in);
    	x = scan.nextInt();
    	h = scan.nextInt();
    	
    	shikaku = x*x;
    	int takasa = (int) Math.sqrt(x+h);
    	sankaku = (int) (x*takasa*0.5*4);
    	S = shikaku + sankaku;
    	
    	System.out.println(S);
    	
    }
}