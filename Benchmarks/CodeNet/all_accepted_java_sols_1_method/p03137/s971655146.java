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
    
    int n = sc.nextInt();
    int m = sc.nextInt();

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    long sum = 0;

    if(m == 1){
        System.out.println(0);

        System.exit(0);
    }
    
    for(int i = 0 ; i < m ; i++){
        list1.add(sc.nextInt());
    }

    Collections.sort(list1);

    for(int i = 0 ; i < m - 1 ; i++){
        list2.add(list1.get(i+1)-list1.get(i));
    }

    Collections.sort(list2);

    for(int i = 0 ; i < m - n ; i++){
        sum += list2.get(i);
    }

    System.out.println(sum);


    


    








    

    
    

    


    
    


    


    
    


    
	}
}