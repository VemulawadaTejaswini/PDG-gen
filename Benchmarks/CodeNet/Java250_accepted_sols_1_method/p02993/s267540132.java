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
    
    List<Character> list = new ArrayList<>();
    String s = sc.next();
    int count = 0;

    for(int i = 0; i < s.length(); i++){
        list.add(s.charAt(i));

        
        }
    
    for(int i = 0; i < s.length()-1; i++){
        if(list.get(i).equals(list.get(i+1))){
            count++;
        }
    }
    if(count == 0){
        System.out.println("Good");
    }else{
        System.out.println("Bad");
    }




    
    


    
	}
}