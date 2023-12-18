import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	int fa = 0;
    	int fb = 0;
    	Scanner scan = new Scanner(System.in);
    	while (true){
    	fa = scan.nextInt();
    	fb = scan.nextInt();
    	int sum = fa + fb;
    	int time = (int) Math.log10(sum) + 1;
    	 System.out.println(time);
    	}
    }
 }