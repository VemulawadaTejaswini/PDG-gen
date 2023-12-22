import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class Main {
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //List<String> list = new ArrayList<>();
    String s = sc.next();
    
    char[] work = new char[n];

    for(int i = 0; i < n; i++){
            work[i] = s.charAt(i);
    
            }
    int count = 1;
    for(int i = 0; i < n-1; i++){
        if(work[i] != work[i+1]){
            count++;
        }
    }
    
    System.out.println(count);
    

    }
}