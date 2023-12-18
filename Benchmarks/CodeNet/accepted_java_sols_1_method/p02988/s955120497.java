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
    int count = 0;

    int n = sc.nextInt();

    for(int i = 0; i < n ; i++){
        list.add(sc.nextInt());
    }

    for(int i = 1; i < n - 1; i++){
        if(list.get(i - 1) < list.get(i) && list.get(i) < list.get(i + 1)){
            count++;
        }
        if(list.get(i - 1) > list.get(i) && list.get(i) > list.get(i + 1)){
            count++;
        }
    }

    System.out.println(count);









    
    






    

    



    
  

    


    


    

    
    
    



    





}
}