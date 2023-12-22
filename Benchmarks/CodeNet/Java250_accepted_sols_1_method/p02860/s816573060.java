import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class Main{
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int count = 0;

    if(n % 2 == 1){
        count++;
    }
    char[] work = new char[s.length()];

    for(int i = 0; i < n; i++){
            work[i] = s.charAt(i);
            }
    
    for(int i = 0; i < n/2; i++){
        if(work[i] == work[i+n/2]){
        }else{
            count++;
        }
    }      

    if(count == 0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    
	}
}