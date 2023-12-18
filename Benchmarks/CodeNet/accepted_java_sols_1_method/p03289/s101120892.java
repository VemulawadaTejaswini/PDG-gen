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
    
    String s = sc.next();

    int count = 0;
    int s_research = 0;

    if(s.charAt(0) == 'A'){

    }else{
        count++;
    }

    //System.out.println(count);
    for(int i = 2 ; i < s.length()-1;i++){
        if(s.charAt(i) == 'C'){
            if(s_research==0){
                s_research++;
            }else{
                count++;
            }
        }
    }

    //System.out.println(count);

    for(int i = 1; i < s.length() ; i++){
        if( Character.isUpperCase( s.charAt( i ) ) ) {
            if(s.charAt(i) == 'C'){
                
            }else{
                count++;
            }
        }else {

         }
    }

    

    //System.out.println(s_research);
    //System.out.println(count);
    if(s_research == 0){
        System.out.println("WA");
    }else if(count == 0){
        System.out.println("AC");
    }else{
        System.out.println("WA");
    }

    

    
  

    
    
    


    


    
    


    
	}
}