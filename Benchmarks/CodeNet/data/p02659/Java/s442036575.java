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
    long n = sc.nextLong();
    long c = 1000000000000000000L;
    double d = 0.000000000000000001;
    long e = 1;

    List<Long> list = new ArrayList<>();

    for(int i = 0; i < n; i++){
        list.add(sc.nextLong());
    }
    for(int i = 0 ; i < n;i++){
        d *= list.get(i);
    }

    if(d > 1){
        System.out.println(-1);
    }else{
        for(int i = 0 ; i < n;i++){
            e *= list.get(i);
        }
        System.out.println(e);
    }
    
  

    
    
    


    


    
    


    
	}
}