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
    String n = sc.next();
    char[] work = new char[n.length()];
    int count = 0;

    for(int i = 0; i < n.length(); i++){
            work[i] = n.charAt(i);
            }
    
    for(int i = 0; i < n.length(); i++){
        if(i % 2 == 0){
            if(work[i] == 'L'){
                count++;
            }
        }else{
            if(work[i] == 'R'){
                count++;
            }
        }
        
    }

    if(count == 0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    

    }
}