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
    int s1 = 0;
    int s2 = 0;
    int min = 10001;

    for(int i = 0; i < n; i++){
        list.add(sc.nextInt());
    }

    for(int i = 0; i < n; i++){
        for(int j = 0; j < n ; j++){
            if(j <= i){
                s1 += list.get(j);
            }else{
                s2 += list.get(j);
            }
        }

        if(min >= Math.abs(s1 - s2)){
            min = Math.abs(s1 - s2); 
        }

        s1 = 0;
        s2 = 0;
    }

    System.out.println(min);

    



    



   
    





}
}