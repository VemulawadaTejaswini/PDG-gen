import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.io.Serializable;

public class Main {
	public static void main(final String[] args){
    
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        int count = 0;

        char[] work1 = new char[s.length()];
        char[] work2 = new char[t.length()];

        for(int i = 0; i < s.length(); i++){
            work1[i] = s.charAt(i);

            }

        for(int i = 0; i < t.length(); i++){
                work2[i] = t.charAt(i);
        
            }
        
        for(int i = 0; i < s.length(); i++){
            if(work1[i] == work2[i]){
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