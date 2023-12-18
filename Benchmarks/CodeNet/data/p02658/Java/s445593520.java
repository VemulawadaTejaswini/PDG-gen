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
    
    final Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();
    final List<Long> list = new ArrayList<>();

    long max = 1000000000000000000L;
    long count = 1;
    
    for(int i = 0; i < n ; i++){
        list.add(sc.nextLong());
        if(list.get(i) == 0){
            System.out.println(0);
            System.exit(0);
        }
    }

    for(int i = 0; i < n ; i++){
        max /= list.get(i);
        //System.out.println(max);
    }


    if(max < 1){
        System.out.println(-1);
    }else{
        for(int i = 0 ; i < n ; i++){
            count *= list.get(i);
        }
        System.out.println(count);
    }


    









    

    



    
  

    


    


    

    
    
    



    





}
}