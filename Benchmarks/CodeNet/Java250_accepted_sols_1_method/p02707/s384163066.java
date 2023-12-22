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

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i = 1 ; i < n ; i++){
            list.add(sc.nextInt());
        }

        for(int i = 0 ; i < n ; i++){
            list2.add(0);
        }

        for(int i = 0 ; i < n-1 ; i++){
            list2.set(list.get(i)-1, list2.get(list.get(i)-1)+1);
            //System.out.println(list2);
        }

        for(int i = 0 ; i < n ; i++){
            System.out.println(list2.get(i));
        }


  
                


    }
}