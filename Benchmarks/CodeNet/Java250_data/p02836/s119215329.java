import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;
    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == s.charAt(s.length()-1-i)){
        }else{
            count++;
        }
    }

    System.out.println(count/2);
    
    
	}
}