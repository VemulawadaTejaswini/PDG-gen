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
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    List<Integer> list3 = new ArrayList<>();
    int count = 0;
    long sum = 0;
    int check = 0;

    for(int i = 0; i < n;i++){
        list1.add(sc.nextInt());
        sum += list1.get(i);
    }
    int q = sc.nextInt();

    for(int i = 0; i < q;i++){
        list2.add(sc.nextInt());
        list3.add(sc.nextInt());
    }

    for(int i = 0; i < q;i++){
        for(int j = 0; j < n;j++){
            if(list1.get(j).equals(list2.get(i))){
                count++;
                list1.set(j,list3.get(i));
            }
            
        }
        //System.out.println(list1);
        check = list3.get(i) - list2.get(i);
        sum = sum + (count*check);
        System.out.println(sum);
        count = 0;
        check = 0;
    }

    

    
    

    


    
    


    


    
    


    
	}
}