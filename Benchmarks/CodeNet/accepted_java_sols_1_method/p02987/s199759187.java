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
    //final List<Long> list = new ArrayList<>();

    String s = sc.next();
    int count = 0;

    for(int i = 0; i < 4 ; i++){
        for(int j = i + 1; j < 4 ; j++){
            if(s.charAt(i) == s.charAt(j)){
                count++;
            }
        }
    }

    if(count == 2){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }

    
    






    

    



    
  

    


    


    

    
    
    



    





}
}