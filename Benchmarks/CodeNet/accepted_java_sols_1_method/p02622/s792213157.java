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
    String t = sc.next();
    int count = 0;

    //List<Character> list1 = new ArrayList<>();
    //List<Character> list2 = new ArrayList<>();

    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i)==t.charAt(i)){

        }else{
            count++;
        }
    }

    //System.out.println(list1);
    //System.out.println(list2);


    //for(int i = 0; i < list1.size(); i++){
        //if(list1.get(i).equals(list2.get(i))){
        //}else{
           // count++;
        //}
    //}

    System.out.println(count);

    
    

    


    
    


    


    
    


    
	}
}