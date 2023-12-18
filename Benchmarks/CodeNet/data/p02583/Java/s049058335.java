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
    final List<Integer> list = new ArrayList<>();
    //final List<Long> list2 = new ArrayList<>();

    int n = sc.nextInt();
    int count = 0;

    for(int i = 0; i < n ; i++){
        list.add(sc.nextInt());
    }

    for(int i = 0; i < n ; i++){
        for(int j = i + 1; j < n ; j++){
            for(int l = j + 1; l < n ; l++){
                if(list.get(i) != list.get(j) && list.get(j) != list.get(l) && list.get(l) != list.get(i)){
                    if(list.get(i) < list.get(l) && list.get(j) < list.get(l) && list.get(i) + list.get(j) > list.get(l)){
                        count++;
                        //System.out.println((i+1) + " " + (j+1) + " " + (l+1));
                    }else if(list.get(j) < list.get(i) && list.get(l) < list.get(i) && list.get(j) + list.get(l) > list.get(i)){
                        count++;
                        //System.out.println((i+1) + " " + (j+1) + " " + (l+1));
                    }else if(list.get(i) < list.get(j) && list.get(l) < list.get(j) && list.get(l) + list.get(i) > list.get(j)){
                        count++;
                        //System.out.println((i+1) + " " + (j+1) + " " + (l+1));
                    }
                }
            }
        }
    }

    System.out.println(count);



    


    

   
    





}
}