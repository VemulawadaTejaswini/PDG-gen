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
    final List<Long> list = new ArrayList<>();
    //final List<Long> list2 = new ArrayList<>();

    int n = sc.nextInt();
    for(int i = 0; i < n ; i++){
        list.add(sc.nextLong());
    }

    long max = list.get(0);
    long sum = 0;

    for(int i = 1; i < n ; i++){
        if(max > list.get(i)){
            sum += max - list.get(i);
        }else{
            max = list.get(i);
        }

        //System.out.println(sum + " " + max);
    }
    System.out.println(sum);

    

    





}
}