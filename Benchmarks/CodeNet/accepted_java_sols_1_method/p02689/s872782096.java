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
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < n ; i++){
            list1.add(sc.nextInt());
        }

        List<Integer> list4 = new ArrayList<>(list1);
        for(int i = 0; i < m ; i++){
            list2.add(sc.nextInt());
            list3.add(sc.nextInt());
        }

    
        for(int j = 0; j < m ; j++){
            if(list1.get(list2.get(j) - 1) < list1.get(list3.get(j) - 1)){
                list4.set(list2.get(j) - 1 , 0); 
            }else if(list1.get(list2.get(j) - 1).equals(list1.get(list3.get(j) - 1))){
                list4.set(list3.get(j) - 1 , 0); 
                list4.set(list2.get(j) - 1 , 0); 
            }else{
                list4.set(list3.get(j) - 1 , 0); 
            }
        }
        //System.out.println(list4);

        for(int i = 0; i < n ; i++){
            if(list4.get(i).equals(0)){
                count++;
            }
        }

        System.out.println(list1.size()-count);

        


    }
}