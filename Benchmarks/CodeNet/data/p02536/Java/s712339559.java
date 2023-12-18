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
    final List<Integer> list2 = new ArrayList<>();
    //final List<Long> list3 = new ArrayList<>();

    int n = sc.nextInt();
    int m = sc.nextInt();
    int check = 1;
    int count = 0;

    for(int i = 0 ; i < m ; i++){
        list.add(sc.nextInt());
        list2.add(sc.nextInt());
    }

    list.addAll(list2);

    for(int i = 1 ; i < n + 1; i++){
        boolean b = list.contains(check);
        if(b == false){
            count++;
        }
        check++;
    }

    System.out.println(count);



   






    

   

    

    




    







}
}