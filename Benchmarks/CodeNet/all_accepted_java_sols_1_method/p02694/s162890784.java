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

        long x = sc.nextLong();

        double a = 100;
        long k = 0;
        int count = 0;

        double rate = 1.01;
        
        while(x > a){
            a = rate * a;
            k = (long)a;
            a = (double)k;
            count++;
        }
        System.out.println(count);


        
        






    }
}