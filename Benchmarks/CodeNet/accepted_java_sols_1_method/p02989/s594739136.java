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
    int n = sc.nextInt();

    for(int i = 0; i < n ; i++){
        list.add(sc.nextInt());
    }

    Collections.sort(list);

    int num = list.get(n/2) - list.get(n/2 - 1);

    //System.out.println(list);

    System.out.println(num);









    
    






    

    



    
  

    


    


    

    
    
    



    





}
}