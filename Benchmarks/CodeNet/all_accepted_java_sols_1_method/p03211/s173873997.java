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

        String x = sc.next();
        int num = 0;
        int min =1000;

        char[] work = new char[x.length()];

        for(int i = 0; i < x.length(); i++){
            work[i] = x.charAt(i);
            //System.out.println((int)work[i]);
            }
        
        for(int i = 0; i < x.length()-2 ; i++){
            num = 100*((int)work[i]-48) + 10*((int)work[i+1]-48) + ((int)work[i+2]-48);
            num = num - 753;
            if(Math.abs(num) < min){
                min = Math.abs(num);
            }
            num = 0;
        }

        System.out.println(min);


        


    }
}