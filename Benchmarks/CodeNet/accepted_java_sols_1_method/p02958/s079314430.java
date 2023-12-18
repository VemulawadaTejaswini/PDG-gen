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
    //final List<String> list2 = new ArrayList<>();
    int n = sc.nextInt();
    int count = 0;
    
    for(int i = 0; i < n ; i++){
        list.add(sc.nextInt());
    }
    List<Integer> list2= new ArrayList<Integer>(list);
    
    Collections.sort(list);


    for(int i = 0; i < n ; i++){
        if(list.get(i) != list2.get(i)){
            count++;
        }
    }

    if(count <= 2){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }

    
    



















    
    






    

    



    
  

    


    


    

    
    
    



    





}
}